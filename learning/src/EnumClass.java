
public class EnumClass {
	public enum currency{
		rupee, dollar, riyal, ghnta;
	}
	public static void main(String[] args){
		for(currency cu : currency.values())
			System.out.println(cu + "" + cu.ordinal());
	}
}
