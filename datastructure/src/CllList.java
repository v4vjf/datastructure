 package datastructure;

public class CllList {
	private int length = 0;
	private CllNode head;
	private CllNode end;
	public CllList(){
		this.length = 0;
		this.head = null;
		end = null;
	}
	public void insertAtFirst(CllNode node){//inserting at the beginning
		if(isEmpty()){
			head = node;
			end = node;
			length++;
		}
		else{
			node.setNext(head);
			head = node;
			end.setNext(head);
			length++;
		}
	}
	public boolean isEmpty(){//checking if the list is empty
		if(head == null)
			return true;
		else
			return false;
	}
	public void insertAtEnd(CllNode node){//inserting at the end
		if(isEmpty()){
			head = node;
			end = node;
			length++;
		}
		else{
			node.setNext(head);
			end.setNext(node);
			end = node;
			length ++;
		}
		
	}
	public void insertAtPosition(int position, CllNode node){
		if(isEmpty() && position == 1){
			head = node;
			end = node;
			length++;
		}
		else{
			CllNode temp = getPrevPosition(position);//get reference preceeding the position
			if(temp == null){
				System.out.println("position is invalid not inserted");
				return;
			}
			else{
				node.setNext(temp.getNext());
				temp.setNext(node);
				length++;				
			}
		}
	}
	public CllNode delFirst(){
		if(isEmpty()){
			System.out.println("list is empty nothing to delete");
			return null;
		}
		//this part will be executed only if list is not empty
		if(end == head){//if there is only single element
			CllNode temp = head;
			clrList();
			return temp;
		}
		CllNode temp = head;
		head = head.getNext();
		end.setNext(head);
		length--;
		return temp;		
	}
	public void clrList(){
		head = null;
		end = null;
		length = 0;
	}
	public CllNode delLast(){
		if(isEmpty()){
			System.out.println("list is empty nothing to delete");
			return null;
		}
		if(end == head){ //if there is only one element
			CllNode temp = head;
			clrList();
			return temp;
		}
		CllNode templ = head, temp = head;
		while(temp!=end){
			templ = temp;
			temp = temp.getNext();
		}
		end = templ;
		templ.setNext(head);
		length --;
		if(length == 0)
			clrList();
		return temp;
	}
	public CllNode delPosition(int position){
		if(isEmpty()){
			System.out.println("list is empty nothing to delete");
			return null;
		}
		if(length == 1 && position == 1){
			CllNode temp = head;
			clrList();
			return temp;
		}
		CllNode temp = getPrevPosition(position);
		
		if(temp == null){
			System.out.println("position is invalid! not deleted");
			return null;
		}
   		if(temp == end){
   			head = temp.getNext().getNext();
   		}
		CllNode tempr = temp.getNext();
		if(tempr == end)
			end = temp;
		
		temp.setNext(tempr.getNext());
		length--;
		
		return tempr;
	}
	private CllNode getPrevPosition(int position){
		if(isEmpty())
			return null;
		if(position == 1)
			return end;
		int count = 2;
		CllNode templ = head,current = head.getNext();
		while(current != head){
			
			if(count == position){
				
				return templ;
			}
			
			templ = templ.getNext();
			current = current.getNext();
			count++;
		}
		if(current == head)
			return null;
		System.out.println(templ);
		return templ;
		
	}
	public int getLength(){
		return length;
	}
	public String toString(){
		if(isEmpty()){//if list is empty
			System.out.println("list is empty");
			return "";
		}
		String s = "[";
		CllNode temp = head;
		s = s + temp.getData();
		temp = temp.getNext();
		if(length!=1){
			while(temp != end){//printing data till last but one node
				s = s + "," + temp.getData();
				temp = temp.getNext();
			}
			s = s + "," + temp.getData();//printing the last node
		}
		s = s + "]";
		return s;
		
	}
}
