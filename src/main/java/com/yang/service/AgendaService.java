package com.yang.service;

import com.yang.dao.AgendaDao;
import com.yang.model.Agenda;
import com.yang.model.User;

/**
 * Created by 90750 on 2017/9/22.
 */
public class AgendaService {
    private AgendaDao AgendaDao = com.yang.dao.AgendaDao.getInstance();

    /*添加用户到指定会议下
  1·判别用户是否已在会议下以及会议是否存在
  2·判别用户该时间段是否有空
  3·创建者者在建立会议时，应将自己放入到会议中
 */
    public void addUserToAgenda(String title,User... userName){
        Agenda agenda=AgendaDao.findByTitle(title);
        if(agenda==null) {
            System.out.println("该会议不存在，请确认会议名称后重新输入。");
            return;
        }
        for(User u:userName){
            //判断成员是否有存在时间冲突。如果有加入到会议成员中；若没有，记录下来，并输出结果。
            agenda.addParticipator(u);
        }
        //判断是否有成员未加入，有得话输出未成功名单；否者输出成功
        System.out.println("成员加入会员成功！");
    }

    public void removeUserFromAgenda(String title,User... userName){
        Agenda agenda=AgendaDao.findByTitle(title);
        if(agenda==null) {
            System.out.println("该会议不存在，请确认会议名称后重新输入。");
            return;
        }
        for(User u:userName){
            //判断成员是否有空。如果有加入到会议成员中；若没有，记录下来，并输出结果。
            agenda.removeParticipator(u);
        }
        System.out.println("成员移除成功！");
        if(agenda.getParticipator()==null) {
            if(AgendaDao.deleteAgenda(title)){
                System.out.println("由于会议：'"+title+"'无参与人员，故被删除！");
            }
            else {
                System.out.println("会议删除失败！");
            }
        }
    }
}
