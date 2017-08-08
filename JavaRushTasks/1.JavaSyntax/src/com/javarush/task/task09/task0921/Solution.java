package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        ArrayList list = new ArrayList();

        try {

            while(true) {
                number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } catch (NumberFormatException e) {

            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));

            }
        }
    }
}
