package Java_Programs;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class distinct_chars {

	public static void main(String[] args) {
// TODO Auto-generated method stub

	
		        String input = "aaaabbbb";
		        Set<Character> distinctChars = new LinkedHashSet<>();
		        
		        char[] c1=input.toCharArray();
		        for (char c : c1) {
		            distinctChars.add(c);
		        }
		        
		        System.out.println(distinctChars);
		        String one= distinctChars.toString();
		        System.out.println(one);
		        
		        
		        String name="aaabbbbcccc";
		        for(int i=0;i<name.length();i++)
		        {
		        	//if(distinctchars(i)==name.charAt(i);
		        }
		    
		
	}

}
