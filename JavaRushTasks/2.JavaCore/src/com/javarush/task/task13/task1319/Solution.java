package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

//        Программа работает но не принимает...

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        File file = new File("d:/new_text.txt");
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//
//        while(true) {
//
//            String str = reader.readLine();
//
//            if(str.equals("exit")) {
//                writer.write(str);
//                writer.close();
//                break;
//            }else{
//                writer.write(str + "\r\n");
//
//            }
//        }
//        reader.close();
//    }


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        String str;
        do  {
            str = reader.readLine();
            writer.write(str);
            writer.newLine();
        } while (!str.equals("exit"));
        writer.close();
        reader.close();
    }
}
