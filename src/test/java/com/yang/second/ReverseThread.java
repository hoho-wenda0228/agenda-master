package com.yang.second;

/**
 * Created by 90750 on 2017/10/28.
 */
import java.io.*;

public class ReverseThread extends Thread {
    private PrintWriter out = null;
    private BufferedReader in = null;

    public ReverseThread(PrintWriter out, BufferedReader in) {
        this.out = out;
        this.in = in;
    }

    public void run() {
        try {
            String line;
            while ((line = in.readLine()) != null) {
                StringBuffer reversed = new StringBuffer(line);
                reversed.reverse();
                out.println(reversed.toString());
                out.flush();
            }
            out.close();
        } catch (IOException exc) {
            System.err.println("SortThread run: " + exc);
        }
    }
}
