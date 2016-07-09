import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class LuckFour {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int l,i,count,t;
		String str;
		t = Integer.parseInt(in.readLine());
		for(;t>0;t--){
			str = in.readLine();
			l = str.length();
			count = 0;
			for(i=0;i<l;i++){
				if(str.charAt(i)=='4')
					count++;
			}
			out.write(count + "\n");
			out.flush();
		}

	}

}
