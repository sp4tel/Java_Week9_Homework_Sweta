package javaweek9homework;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayIsEmptyOrNot {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        // Add elements to the ArrayList
        arrayList.add("Shona");
        arrayList.add("Eileen");
        arrayList.add("Lynn");

        System.out.println("Original array list: " + arrayList);
        System.out.println("Checking the above array list is empty or not: " + arrayList.isEmpty());
        arrayList.removeAll(arrayList);

        System.out.println("Array list after removing all the elements" + arrayList);
        System.out.println("Checking the above array list is empty or not:" + arrayList.isEmpty());

        }


    }

