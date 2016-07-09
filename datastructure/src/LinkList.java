package datastructure;

public class LinkList {
	private static int counter = 0;
	private int length = 0;
	public LinkList(){		//default constructor for the link list
		length = 0;			//length of the link list
	}
	private ListNode head;			//contains head of the link list
	public ListNode getHead(){//returns head
		return head;
	}
	//check if the list is empty
	public boolean isEmpty(){
		if (head == null)
			return true;
		else 
			return false;
	}
	//return reference to last element
	public ListNode returnLastElement(){
		if(!isEmpty()){
			ListNode templ, temp;
			temp = head;
			templ = temp;
			while(temp != null){
				templ = temp;
				temp = temp.getNext();
			}
			return templ;
		}
		else return null;
	}
	public void insertAtBeginning(ListNode node){//inserting at beginning
		node.setNext(head);
		head = node;
		length++;
	}
	public void insertAtEnd(ListNode node){//inserting at the end
		if(isEmpty()){
			head = node;
		}
		else{
			ListNode templ = returnLastElement();
			templ.setNext(node);
			node.setNext(null);
		}
		length++;
	}
	//inserting at a position shifting right the remaining nodes
	public void insertAtPosition(int position , ListNode node){
		int count = 1;
		ListNode templ, temp;
		temp = head.getNext();
		templ = head;
		while(count != position){
			templ = temp;
			temp = temp.getNext();	
			count++;
		}
		templ.setNext(node);
		node.setNext(temp);
		length++;
	}
	//removing item from beginning and return deleted node
	public ListNode removeFromBegin(){
		if(isEmpty()){
			System.out.println("link list is empty");
			return null;
		}
		else{
			ListNode temp = head;
			head = head.getNext();
			length--;
			temp.setNext(null);
			return temp;
		}
	}
	public void insert(ListNode node){
		if(isEmpty()){
			head = node;
			node.setNext(null);
		}
		else insertAtEnd(node);
	}
	public ListNode removeFromEnd(){
		if(!isEmpty()){
			ListNode templ, temp;
			temp = head.getNext();
			templ = head;
			while(temp.getNext() != null){
				templ = temp;
				temp = temp.getNext();
			}
		templ.setNext(null);
		length--;
		return temp;
		}
		else return null;
	}
	// remove node matching specific data
	public ListNode removeDataNode(int data){
		if(!isEmpty()){
			if(head.equals(data)){
				head = head.getNext();
			}
			else{
				ListNode templ = head;
				ListNode temp = templ.getNext();
				while(true){
					if(temp.equals(data))
						break;
					else
						if(temp!=null){
							templ = templ.getNext();
							temp = temp.getNext();
						}
					if(temp == null){
						templ = null;
						break;
					}
				}
				if(templ == null){
					System.out.println("data not found");
					return null;
				}
				else{
					templ.setNext(temp.getNext());
					temp.setNext(null);		
					return temp;
				}
			}
		}	
		return null;
		
	}
	//removing element from a position
	public ListNode removePosition(int position){
		int count = 1;
		
		if(position ==1){
			ListNode temp = head;
			head = head.getNext();
			return temp;
		}
		else{
			ListNode templ, temp;
			temp = head;
			templ = head;
			while(count != position){
				templ = temp;
				temp = temp.getNext();	
				count++;
			}
			templ.setNext(temp.getNext());
			temp.setNext(null);
			return temp;
		}
	}
	public String toString(){
		if(!isEmpty()){
			ListNode temp = head;
			String string = "[" + temp.getData();
			temp = temp.getNext();
			while(temp!=null){
				string = string + (",") + temp.getData();
				temp = temp.getNext();
			}
			string = string + ("]");
			return string;
		}
		else return "!#!#!#list is empty!#!#!#";
	}
	//return length of the list
	public int lenght(){
		return length;
	}
	//deletes the list
	public void clearList(){
		head = null;
		length = 0;
	}
	//returning matching element
	public int returnPosition(int data){
		if(!isEmpty()){
			ListNode temp = head;
			int count = 1;
			while(temp !=  null){
				if(temp.equals(data))
					break;
				else{
					temp = temp.getNext();
					count++;
				}
			}
			if(temp == null)
				return -1;
			else return count;
		}
		else return -1;
	}
	public void reverse(ListNode current, int k){//reverse first k elements of the list
		if(current ==  null)
			return;
		ListNode next = current.getNext();
		k--;
		if(k<1||current.getNext() == null){
			head.setNext(next);
			
			head = current;
			return;
		}
		reverse(next, k);
		next.setNext(current);

	}
	public ListNode fractionalNode(ListNode head, int k){//returning fractional node
		ListNode mover = head, fracNode = null;
		int i;
		while(mover!=null){
			i = k;
			while(i>0 && mover != null){
				mover = mover.getNext();
				i--;
			}
			if(i == 0){
				if(fracNode == null)
					fracNode = head;
				else 
					fracNode = fracNode.getNext();
			}
			if(mover == null){
				if(i == 0){
					return fracNode;
				}
			}
		}
		return null;
	}
	public void alternateList(){//1->2->3->4->5 = 1->5->2->4->3->5
		if(head == null)
			return ;
		ListNode slwPtr = head;
		ListNode fstPtr = head.getNext();
		ListNode head2 = null;
		while(fstPtr != null && fstPtr.getNext() != null){
			slwPtr = slwPtr.getNext();
			fstPtr = fstPtr.getNext().getNext();
		}
		head2 = slwPtr.getNext();
		slwPtr.setNext(null);
		head2 = reverseList(head2);
		System.out.println(head2);
		slwPtr = head.getNext();
		ListNode temp = head;
		boolean n = true;
		while(slwPtr != null || head2 != null){
			if(n){
				temp.setNext(head2);
				temp = temp.getNext();
				head2 = head2.getNext();
				n = false;
			}
			else{
				temp.setNext(slwPtr);
				temp = temp.getNext();
				slwPtr = slwPtr.getNext();
				n = true;
			}
			
		}
		
		
		
		
	}
	public ListNode reverseList(ListNode head){
		if(head == null)
			return null;
		ListNode prev = head;//Beginning of link list
		ListNode current = head.getNext();
		prev.setNext(null);
		while(current != null){
			ListNode temp = current;
			current = current.getNext();
			temp.setNext(prev);
			prev = temp;
		}
		return prev;
	}
	public ListNode rotateR(ListNode head, int k){//rotate the link list k steps right
		ListNode beg, end;
		beg = head;
		end = head;
		if(head == null || head.getNext()== null)
			return head;
		while(k>0){
			end = end.getNext();
			if(end == null)
				end = head;
			k--;
		}
		System.out.println(end);
		if(end.getNext() == null){
			
			return head;
		}
		head = end.getNext();
		end.setNext(null);
		ListNode temp = head;
		while(temp.getNext() != null)
			temp = temp.getNext();
		temp.setNext(beg);
		return head;
	}
	public static ListNode add(ListNode head1, ListNode head2){
		int sum = 0, carry = 0;
		LinkList list = new LinkList();
		while(head1 != null && head2 != null){
			sum = head1.getData() + head2.getData() + carry;
			if(sum>=10){
				carry = 1;
				sum = sum%10;
			}
			else carry = 0;
			ListNode node = new ListNode(sum);
			list.insert(node);			
			head1 = head1.getNext();
			head2 = head2.getNext();
			sum = 0;
		}
		if(head1 != null){
			while(head1 != null){
				ListNode node = new ListNode(head1.getData());
				list.insert(node);
				head1 = head1.getNext();
			}
		}
		if(head2 != null){
			while(head2 != null){
				ListNode node = new ListNode(head2.getData());
				list.insert(node);
				head2 = head2.getNext();
			}
		}
		return list.getHead();
	}
	public ListNode partition(ListNode head, int k){
		ListNode headL = new ListNode(45);
		ListNode headR = new ListNode(45);
		headR.setNext(head);		
		ListNode pntrL = headL;
		ListNode current = head;
		ListNode prev = headR;
		while(current != null){
			if(current.getData()<k){
				pntrL.setNext(current);
				prev.setNext(current.getNext());
				current = current.getNext();
				pntrL = pntrL.getNext();
				pntrL.setNext(null);
				prev = current;	
			}
			else{
				prev = current;
				current = current.getNext();
			}
		}
		pntrL.setNext(headR.getNext());
		head = headL.getNext();
		this.head = head;
		return head;
	}
}




















