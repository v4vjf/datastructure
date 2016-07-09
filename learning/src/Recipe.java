    import java.io.*;
    public class Recipe{
    	static int hcf(int a, int b){
    		int d;
    		d=a%b;
			if(d==0){
				return b;
			}
			else{
				return hcf(b,d);
			}
    	}
    	public static void main(String[] args)throws Exception{
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    		String[] str;
    		int t;
    		int hcf,i,n,nos[];
    		t = Integer.parseInt(in.readLine().trim());
    		for(;t>0;t--){
    			str = in.readLine().trim().split(" ");
    			n = Integer.parseInt(str[0]);
    			nos = new int[n];
    			for(i=0;i<n;i++){
    				nos[i] = Integer.parseInt(str[i+1]);
    			}
    			hcf = nos[0];
    			for(i=1;i<n;i++){
    				hcf = hcf(hcf,nos[i]);
    			}
    			for(i=0;i<n;i++){
    				nos[i]/=hcf;
    				out.write(nos[i] + " ");
    				out.flush();
    			}
    			out.write("\n");
    			out.flush();
    		}
    	}
     
    }
     