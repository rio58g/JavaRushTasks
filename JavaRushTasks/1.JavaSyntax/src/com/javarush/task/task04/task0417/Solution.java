package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int side1 = Integer.parseInt(reader.readLine());
        int side2 = Integer.parseInt(reader.readLine());
        int side3 = Integer.parseInt(reader.readLine());

        if ( side1 == side2 && side2 == side3){
            System.out.println( side1 + " " + side2 + " " + side3);
        }
        else if (side1 == side2){
            System.out.printf(side1 + " " + side2);
        }
        else if (side2 == side3){
            System.out.printf(side2 + " " + side3);
        }
        else if (side1 == side3){
            System.out.printf(side1 + " " + side3);

        }
    }
}