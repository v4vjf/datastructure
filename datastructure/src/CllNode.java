package datastructure;

public class CllNode {
	private int data;
	private CllNode next;
	CllNode(int data){
		this.data = data;
		this.next = this;
	}
	public CllNode getNext(){
		return next;
	}
	public int getData(){
		return data;
	}
	public String toString(){
		return "" + data;
	}
	public void setData(int data){
		this.data = data;
	}
	public void setNext(CllNode node){
		this.next = node;
	}
}
