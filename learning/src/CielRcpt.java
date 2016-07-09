import java.io.*;
public class CielRcpt{
	
	public static void main(String[] args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int i,p,count,t;
		int[] menu = new int[12];
		menu[0] = 1;
		t = Integer.parseInt(in.readLine());
		for(;t>0;t--){
			count = 0;
			p = Integer.parseInt(in.readLine().trim());
			for(i=1;i<=11;i++){
				menu[i] = 2*menu[i-1];
			}
			if(p<menu[7]){
				for(i=6;i>=0&&p>0;i--){
					if(p>=menu[i]){
						p-=menu[i];
						count++;
					}
				}
			}
			else{
				if(p>=menu[11]){
					for(;p>=menu[11];p-=menu[11],count++);
					if(p<0){
						p +=menu[11];
						count--;
					}
				}
				for(i=10;i>=0&&p!=0;i--){
					if(p>=menu[i]){
						p-=menu[i];
						count++;
					}
				}
				
			}
			out.write(count + "\n");
			out.flush();
		}
	}
}
