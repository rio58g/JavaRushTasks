package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        int side1 = Integer.parseInt(reader.readLine());
        int side2 = Integer.parseInt(reader.readLine());
        int side3 = Integer.parseInt(reader.readLine());

        if (((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side3 + side1) > side2)){
            System.out.println("Треугольник существует.");
        }else{
            System.out.println("Треугольник не существует.");
        }

    }
}