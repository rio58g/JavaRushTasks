package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("d:/new_text.txt");

        FileWriter writer = new FileWriter(file);

        writer.write(reader.readLine());

        writer.close();

    }
}
