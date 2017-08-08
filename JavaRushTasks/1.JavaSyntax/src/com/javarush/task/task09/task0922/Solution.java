package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        Date currentDate = new Date(data);

        System.out.println(dateFormat.format(currentDate).toUpperCase());



    }
}
