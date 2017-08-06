package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String cl= "";
        String met = "";

        StackTraceElement [] stack = Thread.currentThread().getStackTrace();
        for (StackTraceElement st: stack) {
            cl = stack[2].getClassName();
            met = stack[2].getMethodName();

        }
        System.out.println(cl + ": "+ met + ": " + s);

    }
}
