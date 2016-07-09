package datastructure;

public class LinkListImplementation {
	public static void main(String [] args){
		
		LinkList list = new LinkList();
	
		ListNode node = new ListNode(1);
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(9);
		list.insert(node);
		list.insert(node1);
		list.insert(node2);
		list.insert(node3);
		list.insert(node4);
		list.insert(node5);
		System.out.println(list);
		list.partition(list.getHead(), 3);
		System.out.println(list);
		int length = 2;
		System.out.println(length<<2);
		System.out.println(length);

		
		
		

		
		
	}
}
