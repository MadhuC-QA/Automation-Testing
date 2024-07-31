
public class Fibbonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,count=10,n3=0;
		 if(count<=2)
			 System.out.println(n1+""+n2);
		 else
		 {
			 for(int i=0;i<count;i++)
			 {
			 n3=n1+n2;
			 System.out.println(n3);
			 n1=n2;
			 n2=n3;
		 }
		 }
		 

	}

}
