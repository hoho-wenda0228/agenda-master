package com.yang.model;


import sun.util.calendar.LocalGregorianCalendar;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Agenda {
    private String title;
    private Date startTime;
    private Date endTime;
    private String Creator;
    private List<User> participator;//String -> User

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public List<User> getParticipator() {
        return participator;
    }

    public void setParticipator(List<User> participator) {
        this.participator = participator;
    }


    //参与者列表插入
    public void addParticipator(User user) {
        participator.add(user);
    }
    //参与者列表删除
    public void removeParticipator(User user){
        participator.remove(user);
    }
}
