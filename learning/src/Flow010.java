import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Flow010 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int t = Integer.parseInt(in.readLine());
		 char c;
		 for(;t>0;t--){
			 c = in.readLine().charAt(0);
			 switch (c){
			 case 'B' :
				 out.write("BattleShip\n");
				 break;
			 case 'b':
				 out.write("BattleShip\n");
				 break;
			 case 'C':
				 out.write("Cruiser\n");
				 break;
			 case 'c':
				 out.write("Cruiser\n");
				 break;
			 case 'D':
				 out.write("Destroyer\n");
				 break;
			 case 'd':
				 out.write("Destroyer\n");
				 break;
			 case 'F':
				 out.write("Frigate\n");
				 break;
			 case 'f':
				 out.write("Frigate\n");
				 break;
				 
			 }
			out.flush();
		 }	
	}
}


