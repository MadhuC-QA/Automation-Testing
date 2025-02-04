package Java_Programs;
import java.util.*;  
public class Main {

	public static void main(String[] args) {
	
//System.out.println(" Factorial of 3 is " + factorial(3));
		multidimention();
	}

public static int factorial(int n)
{
	if(n==1)
		return 1;
	else return (n*factorial(n-1));
	
}
public static void multidimention()
{
	int a[][]= {{1,2,3},{4,5,6}};
	
	for(int i=0;i<=a.length;i++)
	{
		for (int j=0;j<=a.length;j++)
		{
			System.out.print(a[i][j] + " ");
		}
		System.out.println(" ");
	}
}


}


 







