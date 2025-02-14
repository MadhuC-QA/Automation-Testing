package Java_Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueStrings {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("apple");
        inputList.add("orange");
        inputList.add("banana");
        inputList.add("grape");

        List<String> uniqueList = getUniqueStrings(inputList);
        System.out.println("Unique strings: " + uniqueList);
    }

    public static List<String> getUniqueStrings(List<String> inputList) {
        if (inputList == null || inputList.isEmpty()) {
            return inputList;
        }

        Set<String> set = new LinkedHashSet<>(inputList);
        return new ArrayList<>(set);
        
        //Array
    }
}