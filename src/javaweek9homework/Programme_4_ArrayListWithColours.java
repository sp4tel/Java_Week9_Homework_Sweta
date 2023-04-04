package javaweek9homework;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ArrayListWithColours {

    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();  // create new ArrayList

        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");

        // print out the collection using for-each loop
        System.out.println("Colours in the list:");
        for (Object colour : colours) {
            System.out.println(colour);

        }
    }
}
