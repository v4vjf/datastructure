import java.io.*;

public class Snape {
	static final float ER =  0.001f;
	static float sqrt(int num){
		float rt = (float) (num/2.0);
		float prevRt=0;
		do{
			prevRt = rt;
			rt = (rt + (num/rt))/2;
			

		}while(Math.abs(rt-prevRt)>ER);
		return rt;
		
	}
	
	public static void main(String[] ars)throws Exception{
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t;
		 t = Integer.parseInt(in.readLine());
		 String[] str;
		 int b,ls;
		 for(;t>0;t--){
			 str = in.readLine().split(" ");
			 b = Integer.parseInt(str[0]);
			 ls = Integer.parseInt(str[1]);
			 ls *= ls;
			 b *= b;
			 out.write(sqrt(ls - b) + " ");
			 out.write(sqrt(ls+b) + "\n");
			 out.flush();
		 }
	}
}
