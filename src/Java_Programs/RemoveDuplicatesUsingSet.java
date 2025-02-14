package Java_Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 5, 6, 4, 7, 8, 9, 5};
        int[] result = removeDuplicatesnew(array);
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }

    /*public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int value : set) {
            result[i++] = value;
        }

        return result;
        
        
         
      
    }
      */
    
    public static int[] removeDuplicatesnew(int[] arr)
    {
		int i=0;
    	Set<Integer> st=new LinkedHashSet<>();
    	for(int value:arr)
    	{
    		st.add(value);    		
    	
    	}
    	int[] b=new int[st.size()];
    	for(int c:st)
    	{
    		b[i++]=c;
    	}
    	return b;
    	
    }
}