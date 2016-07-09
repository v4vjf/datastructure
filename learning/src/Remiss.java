import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Remiss {
	private static int max(int a, int b){
		return (a>b)?a:b;
	}
	public static void main(String[] args)throws Exception{
		int t;
		int a,b;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		t = Integer.parseInt(in.readLine());
		String[] str;
		for(;t>0;t--){
			str = in.readLine().split(" ");
			a = Integer.parseInt(str[0]);
			b = Integer.parseInt(str[1]);
			out.write(max(a,b) + " " + (a+b) + "\n");
			out.flush();
		}
	}
}
