package datastructure;

public class DllList {
	private int length = 0;
	private DllNode head;
	private DllNode tail;
	public DllList(){
		length = 0;
	}
	
	public void insertAtBegin(DllNode node){
		if(head == null){
			head = node;
			tail = node;
			
		}
		else{
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}
		length++;		
	}
	public void insertAtEnd(DllNode node){
		if (head == null){
			head = node;
			tail = node;
		}
		else{
			node.setPrev(tail);
			tail.setNext(node);
			tail = node;
		}
		length ++;
	}
	public void insertAtPosition(int position, DllNode node){
		DllNode temp = getPointer(position);
		if(temp != null){
			node.setPrev(temp.getPrev());
			node.setNext(temp);
			temp.getPrev().setNext(node);
			temp.setPrev(node);
			length++;
		}
		else
			System.out.println("unable to insert");
	}
	private DllNode getPointer(int position){//returning reference to node at position specified
		int count = 1;
		if(length == 0){
			System.out.println("list empty position not found");
			return null;
		}
		if(position>length||position<=0){
			System.out.println("position out of bounds");
			return null;
		}
		else{
			DllNode temp = head;
			while(count != position){
				temp = temp.getNext();
				count++;
			}
			return temp;
		}		
	}
	public int getPosition(int position){//getting data at position specified
		return getPointer(position).getData();
	}
	public DllNode delFirst(){//deleting the first node
		if(head == null){
			System.out.println("list is empty");
			return null;
		}
		else{
			DllNode temp;
			if(head==tail){
				temp = head;
				clrList();
			}
			else{			
				temp = head;
				head.getNext().setPrev(null);
				head = head.getNext();
				temp.setNext(null);
				length--;
			}
			return temp;
		}
	}
	public DllNode delEnd(){//deleting node at the end
		if(head == null){
			System.out.println("list is empty nothing to delete");
			return null;
		}
		if(head == tail){
			DllNode temp = head;
			clrList();
			return temp;
		}
		else{
			DllNode temp = tail;
			tail.getPrev().setNext(null);
			tail = tail.getPrev();
			temp.setPrev(null);
			length--;
			return temp;
		}
	}
	public DllNode delPosition(int position){//deleting node at specified position
		DllNode temp = getPointer(position);
		if(temp == null){
			System.out.println("deleting position not found");
			return null;
		}
		if(length == 1){
			temp = head;
			clrList();
			return temp;
		}
		else{
			temp.getPrev().setNext(temp.getNext());
			temp.getNext().setPrev(temp.getPrev());
			length--;
			return temp;
		}
		
	}
	public void clrList(){//deletes the link list
		head = null;
		tail = null;
		length = 0;
	}
	public String toString(){
		if(head == null)
			return "empty list";
		else{
			String s;
			DllNode temp = head;
			s = "[" + temp.getData();
			temp = temp.getNext();
			while(temp != null){
				s = s + "," + temp.getData();
				temp = temp.getNext();
			}
			s = s + "]";
			return s;
		}
	}
	public int getLength(){
		return length;
	}
}
