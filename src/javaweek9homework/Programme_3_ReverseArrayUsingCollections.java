package javaweek9homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArrayUsingCollections {

    public static void main(String[] args) {

        Integer[] arr = {10,20,30,40,50,60,70,80,90,100};
        //Convert array to list
        List<Integer> list = Arrays.asList(arr);

        System.out.println("Original array: " + list);
        //reverse the list
        Collections.reverse(list);

        System.out.print("Reversed array: " );
        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}

