package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> dividedThreeList = new ArrayList<Integer>();
        ArrayList<Integer> dividedTwoList = new ArrayList<Integer>();
        ArrayList<Integer> remainList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < mainList.size(); i++) {
            if (mainList.get(i) % 3 == 0) {
                if((mainList.get(i) % 3 == 0 && mainList.get(i) % 2 == 0)){
                    dividedTwoList.add(mainList.get(i));
                }
                dividedThreeList.add(mainList.get(i));
            } else if (mainList.get(i) % 2 == 0) {
                if((mainList.get(i) % 2 == 0 && mainList.get(i) % 3 == 0)){
                    dividedThreeList.add(mainList.get(i));
                }
                dividedTwoList.add(mainList.get(i));
            } else {
                remainList.add(mainList.get(i));
            }
        }

        printList(dividedThreeList);
        printList(dividedTwoList);
        printList(remainList);
    }

    public static void printList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
