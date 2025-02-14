package Java_Programs;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 5, 6, 4, 7, 8, 9, 5};
        int[] result = removeDuplicates(array);
       // int[] result=removeduplicate(array);
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int n = array.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) 
            {
                if (array[i] == temp[k])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = array[i];
            }
        }

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        return result;
    }
    
   
    
   /* public static int[] removeduplicate(int[] arr)
    {
		int k=0;
		int[] m=new int[arr.length];
    	if(arr.length==0||arr==null)
		{
			return arr;
		}
    	boolean isboolean;
    	for(int i=0;i<arr.length;i++)
    	{
    		isboolean=false;
    		for(int j=0;j<k;j++)
    		{
    		if(arr[i]==arr[j])
    		{
    			isboolean=true;
    			break;
    		}
    	if(!isboolean)
    	{
    		m[k++]=arr[i];
    	}
    		}
    		
    	
    	return arr;
    	
    	
    }
    */
}