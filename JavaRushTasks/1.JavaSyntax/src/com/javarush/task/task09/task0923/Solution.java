package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String text1 = "";
        String text2 = "";

            char [] masChar = text.toCharArray();



        for (int i = 0; i < masChar.length; i++){

            if(masChar[i] == ' '){
                continue;
            }else if(isVowel(masChar[i])) {
                text1 += masChar[i] + " ";

            }else{
                text2 += masChar[i] + " ";
            }
        }
        System.out.println(text1);
        System.out.println(text2);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}