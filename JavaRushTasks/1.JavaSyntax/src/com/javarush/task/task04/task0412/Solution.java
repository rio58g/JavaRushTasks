package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0){
            System.out.println(number = number*2);
        } else if(number < 0) {
            System.out.println(number = number + 1);
        }else{
            System.out.println(number);
        }

    }

}