package org.example;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = listCreating(100);
        System.out.println(myList);
        OptionalDouble average = myList.stream().filter(n -> n % 2 == 0).mapToInt(i->i).average();
        System.out.println("Average is: " + average.getAsDouble());
    }

    public static ArrayList<Integer> listCreating(Integer quantity) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < quantity; i++) {
            list.add(rnd.nextInt(100));
        }
        return list;
    }

}