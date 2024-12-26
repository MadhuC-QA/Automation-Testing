import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class common_elements_in_array {

	public static void main(String[] args) {
		Integer[] array1 = { 4, 2, 3, 1, 6 }; 
		Integer[] array2 = { 6, 7, 8, 4 ,1}; 
		List<Integer> commonElements = new ArrayList<>(); 
		for (int i = 0; i < array1.length; i++) { 
		for (int j = 0; j < array2.length; j++) { 
		if (array1[i] == array2[j]) { 
		commonElements.add(array1[i]); 
		} }} 
		System.out.println("Common Elements for given two array List is:" + 
		commonElements); 
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1)); 
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2)); 
		list1.retainAll(list2); 
		System.out.println("Common Elements:" + list1);
		
		 //array1 = {4, 2, 3, 1, 6 }; 
		//Output = First is:4, Last is: 6 
		Integer[] array5 = {1,2,3,4,5};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array5));  
		// find first element 
		int first = list.get(0);//First Element 
		// find last element 
		int last = list.get(list.size() - 1);//last Element 

	}

}
