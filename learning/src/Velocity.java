
public class Velocity{
	public static void main(String [] args){
		Dog spot =  new Dog();
		spot.name = "sparta";
		spot.says = "ruf!";
		Dog sporty = new Dog();
		sporty.name = "sporty";
		sporty.says = "wurf";
		Dog var = sporty;
		System.out.println(sporty.equals(spot));
	}
}
class Dog {
	String name ;
	String says;
}
