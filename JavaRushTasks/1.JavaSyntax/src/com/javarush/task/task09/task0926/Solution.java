package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {

        ArrayList<int[]> list = new ArrayList<int []>();

        int [] mas1 = {5, 4, 3, 2, 1};
        int [] mas2 = {2, 1};
        int [] mas3 = {4, 3, 2, 1};
        int [] mas4 = {7, 6, 5, 4, 3, 2, 1};
        int [] mas5 = {};

        list.add(mas1);
        list.add(mas2);
        list.add(mas3);
        list.add(mas4);
        list.add(mas5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
