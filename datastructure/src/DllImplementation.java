package datastructure;

public class DllImplementation {
	public static void main(String [] args){
		DllList list = new DllList();
		DllNode node1 = new DllNode(1);
		DllNode node2 = new DllNode(2);
		DllNode node3 = new DllNode(3);
		list.insertAtBegin(node1);
		list.insertAtEnd(node3);
		list.insertAtPosition(2, node2);
		System.out.println(list);
		list.clrList();
		System.out.println(list);
	}
	

}
