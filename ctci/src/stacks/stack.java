package stacks;
class node{
	int d;
	node next;
	public node(int d){
		this.d=d;
		next=null;
	}
	public node(int d2) {
		// TODO Auto-generated constructor stub
	}
}
public class stack {
	node top;
	public stack(){
		top=null;
	}
	public void push(int d){
		node n=new node(d);
		n.next=top;
		top=n;
	}
	public int pop(){
		int d=top.d;
		top=top.next;
		return d;
		}
	public int peek(){
		return top.d;
	}
}
