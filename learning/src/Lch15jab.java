import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
 
public class Lch15jab{
 
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t = Integer.parseInt(in.readLine());
		 int i,l,pos,max=0;
		 String str;
		 
		 for(;t>0;t--){
			 max=0;
			int[] arr = new int[26];
			str = in.readLine().trim();
			l = str.length();
			if((l&1) == 1){
				out.write("NO\n");
				out.flush();
				continue;
			}
			for(i=0;i<l;i++){
				pos = str.charAt(i) - 'a';
				arr[pos]++;
				if(arr[pos]>max){
					max = arr[pos];
				}
			}
			if(max == l/2){
				out.write("YES\n");
				out.flush();
			}
			else{
				out.write("NO\n");
				out.flush();
			}
		 }
		 
	}
}