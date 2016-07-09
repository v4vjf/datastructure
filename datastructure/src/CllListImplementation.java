package datastructure;

public class CllListImplementation {
	public static void main(String [] args){
		CllList list = new CllList();
		CllNode node0 = new CllNode(0);
		CllNode node1 = new CllNode(1);
		CllNode node2 = new CllNode(2);
		list.insertAtFirst(node0);
		list.insertAtEnd(node1);
		list.insertAtEnd(node2);
		System.out.println(list);
		
		list.delLast();
		System.out.println(list);

		list.delLast();
		System.out.println(list);
		list.delLast();
		



		
		

		

		


	}
}
