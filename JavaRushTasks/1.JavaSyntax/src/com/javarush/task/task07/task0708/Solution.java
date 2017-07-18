package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        int maxLength = Collections.max(list).length();

        for(int j = 0; j < list.size(); j++){
            if(maxLength == list.get(j).length()){
                System.out.println(list.get(j));
            }
        }
    }
}
