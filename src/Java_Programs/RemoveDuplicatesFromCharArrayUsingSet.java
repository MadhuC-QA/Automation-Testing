package Java_Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromCharArrayUsingSet {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'a', 'b', 'd', 'e', 'f', 'd'};
        char[] result = removeDuplicates(charArray);
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }

    public static char[] removeDuplicates(char[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        Set<Character> set = new LinkedHashSet<>();
        for (char c : array) {
            set.add(c);
        }

        char[] result = new char[set.size()];
        int i = 0;
        for (char c : set) {
            result[i++] = c;
        }

        return result;
    }
}