package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s  = reader.readLine();

        char [] masChar = s.toCharArray();

        for (int i = 0; i < masChar.length; i ++){

            int parsNumber = Integer.valueOf(masChar[i]);
                    //Integer.parseInt(String.valueOf(masChar[i]));
            if(parsNumber%2 == 0){
                even++;
            }else{
                odd++;
            }

        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
