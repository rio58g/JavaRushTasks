package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        NegAndPos(number1, number2, number3);
    }

    public static void NegAndPos (int n1, int n2, int n3){

        int countNeg = 0;
        int countPos = 0;

        int [] masNum = {n1, n2, n3};

        for (int i = 0; i < masNum.length; i++){
            if(masNum[i] > 0){
                countPos++;
            }else if (masNum[i]<0){
                countNeg ++;

            }
        }
        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);
    }
}
