import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow016 {
	static int gcd(int a, int b){
		if(a%b==0){
			return b;
		}
		else return gcd(b,a%b);
	}
	static int lcm(int a, int b){
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
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t,a,b,gcd;
		 String[] str;
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 str = in.readLine().split(" ");
			 a = Integer.parseInt(str[0]);
			 b = Integer.parseInt(str[1]);
			 gcd = gcd(a,b);
			 
			 out.write(gcd + " " + a*b/gcd + "\n");
			 out.flush();
		 }
	}

}
