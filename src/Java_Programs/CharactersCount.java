package Java_Programs;
import java.util.HashMap;
import java.util.Map;

public class CharactersCount {
    public static void main(String[] args) {
        String str = "abb cccdd dd";
        Map<Character, Integer> charCountMap = countCharacters(str);
        
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        return charCountMap;
    }
}
