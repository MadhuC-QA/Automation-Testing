
public class count_words {

	public static void main(String[] args) {
		String one="AA bbb cccc";
		
		one=one.replaceAll("\\s", "");
		
		System.out.println(one);
		System.out.println(one);		
		char[] arr=one.toCharArray();
   //System.out.println(one.trim());
		for(int i=0;i<arr.length;i++)
		{
			int C=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					C++;
				}
			}
			System.out.println(arr[i] +" is "+ C +"times");
		}

	}

}
