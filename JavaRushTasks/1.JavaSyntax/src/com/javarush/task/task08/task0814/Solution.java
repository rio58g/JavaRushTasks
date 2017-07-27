package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> set = new HashSet<Integer>();

        set.add(2);
        set.add(5);
        set.add(25);
        set.add(8);
        set.add(13);
        set.add(4);
        set.add(15);
        set.add(23);
        set.add(18);
        set.add(1);
        set.add(56);
        set.add(6);
        set.add(44);
        set.add(32);
        set.add(7);
        set.add(65);
        set.add(17);
        set.add(58);
        set.add(90);
        set.add(60);

        return  set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {



        for (int i = 0; i < 10; i++){
            if (set.contains(i)){

                set.remove(i);


            }
        }

        return set;
    }

    public static void main(String[] args) {

        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}
