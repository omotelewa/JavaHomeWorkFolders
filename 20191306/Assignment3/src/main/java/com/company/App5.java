package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App5 {

    public static void main(String[] args) throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter("/Home/foo/output.txt"));

        writer.println("File line 1");
        writer.println("File line 2");

        writer.flush();
        writer.close();
    }
}
