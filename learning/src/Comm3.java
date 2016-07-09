import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Comm3 {
	static float sqrt(int num){
		if(num==1)
			return 1;
		float rt = (float) (num/2.0);
		float prevRt=0;
		do{ 
			prevRt = rt;
			rt = (rt + (num/rt))/2;
			

		}while(Math.abs(rt-prevRt)>0.01);
		return rt;
		
	}
	public static void main(String[] args) throws Exception{
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int t,cx,cy,scx,scy,hsx,hsy,min;float d1,d2,d3;boolean flag1,flag2,flag3;
		/*d1 = dis b/w chef-server
		d2 = dis b/w chef-sous chef
		d3 = dis b/w server-sous chef */
		t = Integer.parseInt(in.readLine());
		String[] str;
		for(;t>0;t--){
			flag1 = false;
			flag2 = false;
			flag3 = false;
			str = in.readLine().split(" ");
			min = Integer.parseInt(str[0]);
			if(min==0){
				out.write("yes\n");
				out.flush();
				continue;
			}
			str = in.readLine().split(" ");
			cx = Integer.parseInt(str[0]);
			cy = Integer.parseInt(str[1]);
			str = in.readLine().split(" ");
			hsx = Integer.parseInt(str[0]);
			hsy = Integer.parseInt(str[1]);
			str = in.readLine().split(" ");
			scx = Integer.parseInt(str[0]);
			scy = Integer.parseInt(str[1]);
			System.out.println("head chef at " + cx + " " +cy);
			System.out.println("head server at" + hsx + " " + hsy);

			System.out.println("sous- chef at " + scx + " "+ scy);
			System.out.println((cx-hsx)*(cx-hsx));
			System.out.println((cy-hsy)*(cy-hsy));
			System.out.println((cx-scx)*(cx-scx));
			System.out.println((cy-scy)*(cx-scy));
			System.out.println((hsx-scx)*(hsx-scx));
			System.out.println((hsy-scy)*(hsy-scy));
			
			d1 = (float)sqrt((cx-hsx)*(cx-hsx)+(cy-hsy)*(cy-hsy));
			d2 = (float)sqrt((cx-scx)*(cx-scx)+(cy-scy)*(cy-scy));
			d3 = (float)sqrt((hsx-scx)*(hsx-scx)+(hsy-scy)*(hsy-scy));
			if(d1<=min){
				System.out.println("d1set" + d1);
				flag1 = true;
			}
			if(d2<=min){
				System.out.println("d2set" + d2);
				flag2=true;
			}
			if(d3<=min){
				System.out.println("d3set" + d3);
				flag3 = true;
			}
			if(flag1&&flag2&&flag3){
				out.write("yes\n");
				out.flush();
			}
			else{
				if(flag1&&flag2){
					out.write("yes\n");
					out.flush();
				}
				else
					if(flag2&&flag3){
							out.write("yes\n");
							out.flush();
					}
				else 
					if(flag3&&flag1){
						out.write("yes\n");
						out.flush();
					}
					else{
						out.write("no\n");
						out.flush();
					}
			}
		}
	}
}
