class Base1{
	Base1(){
		System.out.println("no arg Base1 cons");
	}
	Base1(int i){
		System.out.println("Bas1 cons");
	}
}
class Base2 extends Base1{
	
	Base2(){

		System.out.println("Base2 cons");
	}
}
public class Inheritance extends Base2 {
	public static void main(String [] args){
		Base1 obj = new Base1();
		Base2 obj1 = new Base2();
		Inheritance obj2 = new Inheritance();
		
		
		
	}

}
