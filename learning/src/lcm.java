
public class lcm {
	int lcm (int a, int b){
		int m, n;
		m = a;
		n = b;
		for(;a != b;){
			if(a<b){
				a += m;
			}
			else{
				b += n;
			}
			
		}
		return a;
	}
}
