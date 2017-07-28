package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 20; i++){
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

    Iterator iter = set.iterator ();
        while(iter.hasNext()){
        if ((int)iter.next() > 10)
            iter.remove();
         }
        return set;
    }

    public static void main(String[] args) {

        //System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}
