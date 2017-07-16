package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        int lengthName1 = name1.length();
        int lengthName2 = name2.length();

        if (name1.equals(name2) && lengthName1 == lengthName2) {
            System.out.println("Имена идентичны");
        }
        else if(lengthName1 == lengthName2){
            System.out.println("Длины имен равны");
        }

        }
    }
