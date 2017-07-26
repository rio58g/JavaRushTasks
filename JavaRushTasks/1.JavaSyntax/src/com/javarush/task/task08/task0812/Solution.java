package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        int max = 0;

        for (int i = 0; i < 10; i++){
            list.add(Integer.valueOf(reader.readLine()));
        }

        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i) == list.get(i+1)) {
                count++;
            }

        }
        System.out.println(count);
    }
}