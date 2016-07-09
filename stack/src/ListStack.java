package stack;

import datastructure.ListNode;

public class ListStack {
	private ListNode top;
	private int length;
	public ListStack(){
		top = null;
		length = 0;
	}
	public boolean isEmpty(){
		return(length == 0);
	}
	public int getLength(){
		return length;
	}
	public int getTop(){
		return top.getData();
	}
	public void push(int data){
		ListNode node = new ListNode(0);
		node.setData(data);
		if(isEmpty()){
			top = node;
			length++;
		}
		else{
			node.setNext(top);
			top = node;
			length++;
		}
	}
	public ListNode pop(){
		if(isEmpty()){
			System.out.println("stack is empty");
			return null;
		}
		ListNode temp = top;
		top = top.getNext();
		length--;
		return temp;
	}
	public ListNode peek(){
		if(isEmpty()){
			System.out.println("stack is empty");
			return null;
		}
		return top;
	}
	public int size(){
		return length;
	}
	public String toString() {
		String s = "[";
		if(length > 0)
			s = s + top.getData();
		if(length > 1){
			ListNode temp = top.getNext();
			while(temp != null){
				s = s + "," + temp.getData();
				temp = temp.getNext();
			}
		}
		s = s + "]";
		return s;
	}
}
