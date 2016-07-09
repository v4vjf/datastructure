    import java.io.*;
    public class Flow018{
    	public static void main(String[] args)throws Exception{
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    		int t, arr[],i;
    		arr = new int[21];
    		arr[0] = 1;
    		for(i=1;i<=20;i++){
    			arr[i] = i*arr[i-1];
    		}
    		t = Integer.parseInt(in.readLine());
    		for(;t>0;t--){
    			out.write(arr[Integer.parseInt(in.readLine())]+ "\n");
    			out.flush();
    			
    		}
    	}
    } 
