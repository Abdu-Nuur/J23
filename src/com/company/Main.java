package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> integerList = new ArrayList<>();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {

            integerList.add(i, random.nextInt(0, 2));

            linkedList.add(i, random.nextInt(0, 2));
        }

        Collections.sort(integerList);
        System.out.println("ArrayList"+a(integerList));

        Collections.sort(linkedList);
        System.out.println("LinkedList"+a(linkedList));

    }
    public static ArrayList a(ArrayList<Integer>arrayList){
        return arrayList;
    }

    public static LinkedList a(LinkedList<Integer>linkedList){
        return linkedList;
    }
}