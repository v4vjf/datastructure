import java.io.*;

/*largest remainder that can be found on dividing a number 
N by another number beween 1 and N (both inclusive) 
such that the number is largest, is N/2 + 1*/
public class Muffins3 {
	public static void main(String [] args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int N;
		int t = Integer.parseInt(in.readLine().trim());
		for(;t>0;t--){
			N = Integer.parseInt(in.readLine().trim());
			N = N/2 +1;
			out.write(N + "\n");
			out.flush();
		}
		
	}
}
