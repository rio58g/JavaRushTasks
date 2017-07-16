package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {

    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left){
        this.top=top;
        this.left=left;
        this.width = 50;
        this.height = 50;
    }


    public void initialize(int width){

        this.width = width;
        this.height = 5;
        this.top = 15;
        this.left = 20;
     }
     public void initialize(int width, int height, int left){

        this.width = width;
        this.height = height;
        this.top = 15;
        this.left = left;
     }
     public void initialize(int width, int height, int left, int top){

        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
     }


    public static void main(String[] args) {

    }
}
