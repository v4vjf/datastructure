import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow017 {
	static int secMax(int a, int b, int c){
		if(a==b){
			return b>c?c:b;		
		}
		if((b==c)){
			return a>b?b:a;
		}
		if((a==c)){
			return a>b?b:a;
		}
		int max1, max2;
		if(a>b){
			max1 = b;
			max2 = a;
		}
		else{
			max1 = a;
			max2 = b;
		}
		if(c>max2){
			return max2;
		}
		else{
			if(c>max1)
				return c;
			else return max1;
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 String[] str;
		 int t;
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 str = in.readLine().split(" ");
			 out.write(secMax(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]))+ "\n");
			 out.flush();
		 }
	}

}

