package com.yang.second;

/**
 * Created by 90750 on 2017/10/28.
 */
import java.io.*;

class Echo {
    public static void main(String[] args) throws IOException {
        int ch;
        System.out.print("请输入待回音的字符串：");
        while ((ch = System.in.read()) != '!') {
            System.out.print((char) ch);
        }
    }
}