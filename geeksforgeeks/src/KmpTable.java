
	public class KmpTable {
		
		static int[] computeLPSArray(String pat)
		{
			int[] h = new int[pat.length()];
			int i=1;
			int j =0 ;
			h[0] = 0;
			while(i < pat.length() ){
				if(pat.charAt(i) == pat.charAt(j)){
					h[i] = j + 1;
					i++;j++;
				}
				else{
					if( j!=0 ){
						j = h[j-1];
					}
					else{
						h[i] = 0;
						i++;
					}
				}
			}
			return h;
		}
		public static void kmpAlgo(String text, String pattern){
			int[] lps = computeLPSArray(pattern);
			int count = 0;
			int text_index = 0;
			int pat_index = 0;
			while(text_index<text.length()){
				if(text.charAt(text_index) == pattern.charAt(pat_index)){
					pat_index ++;
					text_index ++;
					if(pat_index == pattern.length()){
						pat_index = lps[pat_index-1];
						count ++;
					}
				}
				else{
					if(pat_index != 0)
						pat_index = lps[pat_index - 1];
					else{
						text_index++;
					}
				}
			}
			System.out.println(count + " match(es) found!");
		}
		public static void main(String[] args){
			String string = "ananabzbababaz";
			kmpAlgo(string,"abaz");
			
		}
	}




