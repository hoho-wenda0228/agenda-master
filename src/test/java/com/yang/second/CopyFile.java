package com.yang.second;

import java.io.*;

/**
 * Created by 90750 on 2017/10/21.
 */
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("> java CopyFile src dest");
            return;
        }
        File inFile = new File(args[0]);
        FileInputStream in = new FileInputStream(inFile);
        File outFile = new File(args[1]);
        FileOutputStream out = new FileOutputStream(outFile);
        int ch;
        while ((ch = in.read()) != -1) out.write(ch);
        in.close();
        out.close();
    }

}