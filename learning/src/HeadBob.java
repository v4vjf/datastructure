import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class HeadBob {
	public static void main(String[] asd)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		int t,n;
		char g;
		boolean ind,notind;
		String str;
		t = Integer.parseInt(in.readLine());
		for(;t>0;t--){
			ind = false;
			notind = false;
			n = Integer.parseInt(in.readLine());
			str = in.readLine();
			for(n= n-1;n>=0;n--){
				g = str.charAt(n);
				if(g == 'I'){
					out.write("INDIAN\n");
					out.flush();
					ind = true;
					notind = false;
					break;
				}
				if(g == 'Y'){
					ind = false;
					notind = true;
				}
			}
			if(notind){
				out.write("NOT INDIAN\n");
				out.flush();
			}
			else{
				if(!ind){
					out.write("NOT SURE\n");
					out.flush();
			
				}
			}
		}
		
	}
}
