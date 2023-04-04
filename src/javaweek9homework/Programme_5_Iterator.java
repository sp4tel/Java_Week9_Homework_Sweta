package javaweek9homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_Iterator {

    public static void main(String[] args) {


        ArrayList<String> subjects = new ArrayList<String>();  // create new ArrayList

        subjects.add("Maths");
        subjects.add("English");
        subjects.add("Science");
        subjects.add("Music");
        System.out.println("Subjects in the list:");


        Iterator it = subjects.iterator();
            while (it.hasNext()){
                System.out.println(it.next());

            }
        }
    }
