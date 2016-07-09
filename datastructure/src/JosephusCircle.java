package datastructure;

public class JosephusCircle {
	public static void main(String [] args){
		ListNode temp = returnWinner(2,5);
		System.out.println(temp);
		
	}
	static ListNode returnWinner(int m, int n){
		ListNode  temp;
		ListNode head = new ListNode(1);
		temp = head;
		int i,j;
		for(i = 2; i<=n ; i++){
			temp.setNext(new ListNode(i));
			temp = temp.getNext();
		}
		temp.setNext(head);
		temp = head;
		for(j = 1 ; j<n ; ++j){
			for(i = 1;i<=(m-2);++i){
				temp = temp.getNext();
			}
			System.out.println("deleting" + temp.getNext());

			temp.setNext(temp.getNext().getNext());
		}
		return temp;
	}
}
