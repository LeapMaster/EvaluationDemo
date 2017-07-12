package NameCountFinder.EvaluationDemo;

import java.util.ArrayList;

/**
 * Created by Shea Prewett on 7/12/17.
 * Main class to output the values from NameCountFinder class
 */
public class RunNameFinder {

    /**
     * Instantiate the necessary objects and run the necessary methods to process common names
     * @param arguments any runtime arguments; unused
     */
    public static void main (String[] arguments) {
        // Declare and instantiate the necessary objects
        NameListGenerator nameListGenerator = new NameListGenerator();
        NameCountFinder nameCountFinder = new NameCountFinder();

        // Generate lists of names to process
        ArrayList<String> nameList = nameListGenerator.generateNameList();
        ArrayList<String> nameListSmall = nameListGenerator.generateNameListSmall();

        // Output info for the large list with multiple common names
        System.out.println("List size: " + nameList.size());
        System.out.println(nameCountFinder.getMostCommonName(nameList));

        // Output info for the small list with one common name
        System.out.println("List size: " + nameListSmall.size());
        System.out.println(nameCountFinder.getMostCommonName(nameListSmall));
    }

}
