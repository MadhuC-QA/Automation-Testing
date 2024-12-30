import java.util.HashSet;
import java.util.Set;
public class distinct_chars {

	public static void main(String[] args) {
// TODO Auto-generated method stub

	
		

	
		        String input = "aaaabbbb";
		        Set<Character> distinctChars = new HashSet<>();
		        
		        for (char c : input.toCharArray()) {
		            distinctChars.add(c);
		        }
		        
		        System.out.println(distinctChars);
		    
		
	}

}
