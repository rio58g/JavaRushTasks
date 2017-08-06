package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();

    }

    public static int getStackTraceDeep() {

        StackTraceElement [] stack = Thread.currentThread().getStackTrace();
        int deep = stack.length;
        System.out.println(deep);
        return stack.length;

    }
}

