import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String n1="Armyeqt", n2="eMqatkry";
	int c=0;
	
	char c1[]=n1.toCharArray();
	char c2[]=n2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	if(c1.length==c2.length)
	{
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]==c2[i])
			{
				c++;
			}
		}
		if(c>0)
		{
			System.out.println("Anagram");
			
		}
		else
		{
			System.out.println("not a anagram");
		}
	}
	else
	{
		System.out.println("It's not Anagram");
	}
	
	String s="";
	System.out.println(s.length());
	}

}
