
public class Pallindrome {

	public static void main(String[] args) {
		String name="Madam1" ,reverse="";
		
		for(int i=0;i<name.length();i++)
		{
			reverse=name.charAt(i)+reverse;
		}
		
		if(name.equalsIgnoreCase(reverse))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}

}
