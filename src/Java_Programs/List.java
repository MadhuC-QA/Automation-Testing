package Java_Programs;
import java.util.*;    
public class List {

	public static void main(String[] args) {
		
		    //Create List    
		    ArrayList<String> names = new ArrayList<String>();    
		    //Adding elements in the List.   
		    names.add("Emma");    
		    names.add("Adele");    
		    names.add("Aria");    
		    names.add("Emma");    
		    names.add(null);
		    names.add(null);
		    
		    //Performing iteration of list to print each element of it.  
		    System.out.println(names);  
		    for(String name: names)    
		        System.out.println(name);  
		    
		    // creating HashSet implementation using the Set    
	        Set<String> veg = new HashSet<String>();     
	      
	        veg.add("Ginger");     
	        veg.add("Garlic");     
	        veg.add("Onion");     
	        veg.add("Ginger"); 
	   
	        veg.add(null);
	        veg.add(null);
	        
	      
	        System.out.println(veg);     
		    }    
		
		//</string></string>  



		// TODO Auto-generated method stub

	}


