package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        int n = 0;

        while (n < a) {
            System.out.println(s);
            n++;
        }

    }
}
