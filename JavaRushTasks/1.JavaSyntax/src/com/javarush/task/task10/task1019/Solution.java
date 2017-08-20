package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();


        while (true){

            String id = reader.readLine();
            if(id.isEmpty()){
                break;
            }
            int id2 = Integer.parseInt(id);
            String name = reader.readLine();
            map.put(name, id2);
        }


        for (HashMap.Entry<String, Integer> pair : map.entrySet()) {
            String id = pair.getKey();
            int name = pair.getValue();
            System.out.println(name + " " + id);
        }
    }
}