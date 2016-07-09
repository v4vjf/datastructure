
	public class Bit{
	public static void main(String [] args){
		go obj = new go(1);
		System.gc();
	}	

		
		
		
	}
 class go {
	int i;
	String s;
	go(int a){
		i=a;
		System.out.println("calling int cons");
	}
	protected void finalize(){
		System.out.println("check");
	}
	
 }
