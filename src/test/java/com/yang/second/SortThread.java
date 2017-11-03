package com.yang.second;

/**
 * Created by 90750 on 2017/10/28.
 */
import java.io.*;

public class SortThread extends Thread {  private PrintWriter out = null;  private BufferedReader in = null;

    public SortThread(PrintWriter out, BufferedReader in) {
        this.out = out;
        this.in = in;
    }

    public void run() {
        int MAXWORDS = 50;
        try {
            String[] list = new String[MAXWORDS];
            int cnt = 0;
            while ((list[cnt] = in.readLine()) != null) cnt++;
            java.util.Arrays.sort(list, 0, cnt - 1);
            for (int i = 0; i < cnt; i++) out.println(list[i]);
            out.close();
        } catch (IOException exc) {
            System.err.println("SortThread run: " + exc);
        }
    }
}