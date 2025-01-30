import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,3,15,6,9,30};
		Arrays.sort(arr);
		System.out.println();
		int max=arr[0];
		
		for (int i=0;i<arr.length;i++)
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		Arrays.sort(arr);
		System.out.println("Largest = "+ arr[arr.length-1]);
	}

}
