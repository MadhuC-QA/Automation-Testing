package Java_Programs;

public class Garbage_Collector {

	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	public static void main(String[] args) {
		
		Garbage_Collector g1=new Garbage_Collector();
		Garbage_Collector g2=new Garbage_Collector();
			
	g1=null;
	g2=null;
	System.gc();
	 try {
         Thread.sleep(1000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
	}
}


