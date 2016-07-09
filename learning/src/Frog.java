
class Amphi {
	public void breathe(){
		System.out.println("breathing");
	}
	public void eat(){
		System.out.println("eating");
	}
	
}
public class Frog extends Amphi{
	public void tur(){
		System.out.println("turr");
	}
	public void eat(){
		System.out.println("not hungry");
	}
	public void breathe(){
		System.out.println("dead frog");
	}
	public static void main(String [] args){
		Frog frog = new Frog();
		Amphi amphi;
		amphi = frog;
		amphi.eat();
		amphi.breathe();
		
		
	}
}
