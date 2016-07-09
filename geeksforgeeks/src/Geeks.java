



public class Geeks {

	public static<T> void func(T t){
		System.out.println(t.getClass().getName());
	}
	public static void main(String args[]){
		func(123);
	}

}
