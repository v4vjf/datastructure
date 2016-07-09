import java.io.*;
public class TurboSort {
	public static void main(String [] args)throws Exception{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
		int arr[] = new int[1000001];	
	
		for(;t>0;t--){
			arr[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		for(t=0;t<1000001;t++){
			if(arr[t]>0){
				for(;arr[t]-- >0;){
					out.write(t + "\n");
					out.flush();
				}
			}
		}
		out.close();
    }
}
