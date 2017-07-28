package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("MAY 5 1986"));
        map.put("Stallone2", new Date("JULY 10 1975"));
        map.put("Stallone3", new Date("JANUARY 12 2000"));
        map.put("Stallone4", new Date("JULY 23 2005"));
        map.put("Stallone5", new Date("AUGUST 26 1981"));
        map.put("Stallone6", new Date("NOVEMBER 13 2016"));
        map.put("Stallone7", new Date("OCTOBER 15 1998"));
        map.put("Stallone8", new Date("AUGUST 6 1991"));
        map.put("Stallone9", new Date("SEPTEMBER 9 1999"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator <Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext()){

            Map.Entry<String, Date> it = iter.next();
            Date dt = it.getValue();
            if(dt.getMonth() == 5 || dt.getMonth() == 6 || dt.getMonth() == 7){
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {

//        HashMap<String, Date> mapp = createMap();
//        System.out.println(mapp);
//        removeAllSummerPeople(mapp);
//        System.out.println(mapp);
    }
}
