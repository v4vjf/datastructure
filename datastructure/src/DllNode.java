package datastructure;

public class DllNode {
	private int data;
	private DllNode prev, next;
	public DllNode(int data){
		this.data = data;
	}
	public DllNode(int data, DllNode prev, DllNode next){
		this.data =  data;
		this.prev = prev;
		this.next = next;
	}
	public void setData(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	public void setPrev(DllNode prev){
		this.prev = prev;
	}
	public void setNext(DllNode next){
		this.next = next;
	}
	public int getData(){
		return data;
	}
	public DllNode getPrev(){
		return prev;
	}
	public DllNode getNext(){
		return next;
	}
	public String toString(){
		String s = "" + data;
		return s;
	}
}
