package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        List list = new ArrayList();

            list.add(number1);
            list.add(number2);
            list.add(number3);

        Collections.sort(list);


        for (int i = list.size()-1; i >= 0; i --){

            System.out.print(list.get(i) + " ");

        }



    }
}
