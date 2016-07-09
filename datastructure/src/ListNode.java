package datastructure;

public class ListNode {
	private int data;
	private ListNode next;
	public ListNode(int data){
		this.data = data;
		this.next = null;
	}
	public int getData(){
		return data;
	}
	public void setData(int data){
		this.data = data;
	}
	public void setNext(ListNode next){
		this.next = next;
	}
	public ListNode getNext(){
		return next;
	}
	public boolean equals(int data){
		if (this.data == data)
				return true;
		else
			return false;
	}
	public String toString(){
		String s = "" + data;
		return s;
	}
	
}
