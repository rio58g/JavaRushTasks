package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour){

        int seconds = hour * 3600;

        return seconds;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.convertToSeconds(2));
        System.out.println(solution.convertToSeconds(3));
    }
}
