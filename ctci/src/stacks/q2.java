package stacks;
class node{
	int data;
	int min;
	node next;
	public node(int d,int min){
		data=d;this.min=min;next=null;
	}
}
public class q2 {
	node top=null;
	int min=Integer.MAX_VALUE;
	public void add(int n){
		if(n<min)
			min=n;
		else
			min=min;
		node newnode=new node(n,min);
		newnode.next=top;
		top=newnode;
	}
	
	
}
