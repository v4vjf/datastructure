
public class StaticInitialisation {
	static String name = "hello world";
	static String name1;
	static{
		name1 = "juggu";
		System.out.println("done");
	}
	StaticInitialisation(){
		System.out.println("cons" + StaticInitialisation.name + "----" + name1);
	}
	static void printt(){
		System.out.println("printt method" + StaticInitialisation.name + "----" + name1);

	}
	
	public static void main(String [] args){
		System.out.println("startic");
		StaticInitialisation.printt();
		
	}
}
