package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {

        HashSet<Cat> result = new HashSet<Cat>();

            result.add(new Cat());
            result.add(new Cat());
            result.add(new Cat());
            result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {

        HashSet<Dog> result1 = new HashSet<Dog>();

            result1.add(new Dog());
            result1.add(new Dog());
            result1.add(new Dog());

        return result1;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        Iterator iterator = pets.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if (obj instanceof Cat){
                iterator.remove();
            }
        }

    }

    public static void printPets(Set<Object> pets) {

        for (Object p: pets){
            System.out.println(p);
        }

    }

    public static class Cat{

    }

    public static class Dog{

    }
}
