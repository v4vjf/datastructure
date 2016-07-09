import java.util.Random;


public class CoinFliping {
	public static void main(String [] args){
		int i;
		Random rand = new Random();
		i = rand.nextInt();
		if(i<5)
			System.out.println("heads");
		else
			System.out.println("tails");
	}

}
