package NameCountFinder.EvaluationDemo;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Shea Prewett on 7/12/17.
 */
public class NameCountFinder {

    /**
     * Return a message of the most common name(s) in a list
     * @param nameList ArrayList of name Strings to process
     * @return a String listing the most common name(s) in the list parameter
     */
    public String getMostCommonName(List<String> nameList) {

        if (nameList.size() > 0) {

            // Declare and instantiate local variables for method
            HashMap<String, Integer> nameCountMap = new HashMap<String, Integer>();
            int maxCount = 0;
            int namesWithCount = 0;
            String outputString = "";

            // Iterate through name list and build map with count for each name
            for (String name : nameList) {
                if (nameCountMap.get(name) == null) {
                    nameCountMap.put(name, 1);
                } else {
                    int newCount = nameCountMap.get(name) + 1;
                    nameCountMap.put(name, newCount);
                    if (newCount > maxCount) {
                        maxCount = newCount;
                    }
                }
            }

            // Iterate through map keyset, add all names with max count to output String
            for (String key : nameCountMap.keySet()) {
                if (nameCountMap.get(key) == maxCount) {
                    // Is a most common name
                    if (namesWithCount == 0) {
                        // First common name with count
                        outputString = key;
                    } else {
                        outputString += ", " + key;
                    }
                    namesWithCount++;
                }
            }
            // Output the string with common name(s)
            if (namesWithCount > 1) {
                return "The most common names are " + outputString;
            } else {
                return "The most common name is " + outputString;
            }
        } else {
            // List of names is empty, return appropriate message
            return "No names in list.";
        }

    }
}
