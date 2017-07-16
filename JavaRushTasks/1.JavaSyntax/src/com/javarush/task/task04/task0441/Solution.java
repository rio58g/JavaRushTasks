package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

//        if (number1 > number2 && number1 > number3 && number2 < number3){
//            System.out.println(number3);
//        }else if (number1 > number2 && number1 > number3 && number3 < number2){
//            System.out.println(number2);
//        }else if (number2 > number1 && number2 > number3 && number3 < number1){
//            System.out.println(number1);
//        }else if (number2 > number1 && number2 > number3 && number1 < number3){
//            System.out.println(number3);
//        }else if (number3 > number1 && number3 > number2 && number1 < number2){
//            System.out.println(number2);
//        }else if (number3 > number1 && number3 > number2 && number2 < number1){
//            System.out.println(number1);
//        }else if (number1 == number2 && number1 == number3){
//            System.out.println(number1);
//
//        }

    comparisonNumber(number1, number2, number3);
    }
    public static void comparisonNumber(int n1, int n2, int n3){
        ArrayList list = new ArrayList();
        list.add(n1);
        list.add(n2);
        list.add(n3);

        Collections.sort(list);
        int a = 0;
        for(int i = 0; i < list.size(); i++){
            a = (int)list.get(1);
        }
        System.out.println(a);
    }

}
