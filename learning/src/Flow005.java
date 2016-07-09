import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow005 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int[] den = {1,2,5,10,50,100};
		 int temp,n,count,i,t;
		 t = Integer.parseInt(in.readLine());
		 for(;t>0;t--){
			 count = 0;
			 i = 5;
			 n = Integer.parseInt(in.readLine());
			 while(i>=0){
				 temp = den[i];
				 while(n>=temp){
					 n -= temp;
					 count ++;
				 }
				 i--;
			 }
			 out.write(count + "\n");
			 out.flush();
			 
		 }
	}

}
