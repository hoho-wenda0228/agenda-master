package com.yang.second;

/**
 * Created by 90750 on 2017/10/28.
 */
import java.io.*;

public class RhymingWords {
    public static Reader reverse(Reader source) throws IOException {
        BufferedReader in = new BufferedReader(source);
        PipedWriter pipeOut = new PipedWriter();
        PrintWriter out = new PrintWriter(pipeOut);
        new ReverseThread(out, in).start();
        PipedReader pipeIn = new PipedReader(pipeOut);
        return pipeIn;
    }

    public static Reader sort(Reader source) throws IOException {
        BufferedReader in = new BufferedReader(source);
        PipedWriter pipeOut = new PipedWriter();
        PrintWriter out = new PrintWriter(pipeOut);
        new SortThread(out, in).start();
        PipedReader pipeIn = new PipedReader(pipeOut);
        return pipeIn;
    }

    public static void main(String[] args) throws IOException {
        FileReader words = new FileReader("words.txt");
        Reader rhymedWords = sort(reverse(words));
        BufferedReader in = new BufferedReader(rhymedWords);
        String line;
        while ((line = in.readLine()) != null) System.out.println(line);
        in.close();
    }
}

