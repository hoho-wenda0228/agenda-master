package com.yang.command;
import com.yang.annotation.AutoCreate;
import com.yang.service.AgendaService;
import org.apache.commons.cli.*;

/**
 * Created by 90750 on 2017/11/4.
 */
@AutoCreate
public class EditAgent extends AbstractCommand {
    AgendaService agendaService=new AgendaService();
    CommandLineParser parser;
    Options opts;

    String editAgent;
    String n;
    String d;
    String o;
    String i;

    public boolean isMe() {
        if (args[0].equals("editAgent")) return true;
        return false;
    }

    public void buildOpts() {
        opts = new Options();
        opts.addOption("h", false, "帮助文档");
        opts.addOption("editAgent", false, "修改会议");
        opts.addOption("n", true, "会议名称");
        opts.addOption("a", true, "添加会议");
        opts.addOption("o", true, "将参与者移出会议");
        opts.addOption("i", true, "将参与者加入会议");
    }

    public void parser() {
        parser = new BasicParser();
        CommandLine cl;
        try {
            cl = parser.parse(opts, args);
            if (cl.getOptions().length > 0) {
                if (cl.hasOption('h')) {
                    HelpFormatter hf = new HelpFormatter();
                    hf.printHelp("帮助", opts);
                } else {
                    n = cl.getOptionValue("n");
                    d = cl.getOptionValue("d");
                    o = cl.getOptionValue("o");
                    i = cl.getOptionValue("i");
                }
            } else {
                System.err.println("ERROR_NOARGS");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void doCommand() {
        agendaService.addUserToAgenda(n);
    }

    public void setUp(String[] args) {
        super.args=args;
    }

}
