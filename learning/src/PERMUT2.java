import java.io.*;
public class PERMUT2 {
	public static void main(String [] args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t,i,a[];boolean flag = false;
		String str[];
		while((t = Integer.parseInt(in.readLine()))>0){
			flag = false;
			a = new int[t];
			str = in.readLine().trim().split(" ");
			for(i=0;i<t;i++){
				a[i] = Integer.parseInt(str[i]);
			}
			for(i=0;i<t;i++){
				if(a[a[i]-1]!=i+1){
					out.write("not ambiguous\n");
					out.flush();
					i=t-1;
					flag = true;
				}
			}
			if(flag == false){
				out.write("ambiguous\n");
				out.flush();
			}
		}
	}
}
