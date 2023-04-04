package javaweek9homework;

import java.util.ArrayList;

public class Programme_6_RetrieveAnElement {

    public static void main(String[] args) {


        ArrayList<String> language = new ArrayList<String>();  // create new ArrayList

        language.add("French");
        language.add("Spanish");
        language.add("German");
        language.add("Latin");
        System.out.println("Languages in the list:" + language);
            // retrieve the element
            String element = language.get(2);

            // print out the retrieved element
            System.out.println("Element at index " +  ": " + element);


        }
    }
