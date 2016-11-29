package linkedlist;

import java.util.Scanner;

class node{
	  int d;
	  node next=null;
	  public node(int j){
		  d=j;
	  }  
}
public class q1 {
	node head;
	node prev;
	public void add(int d){
		node n=new node(d);
			n.next=head;
			head=n;
	}
	public void add1(int d){
		node n=new node(d);
			if(head==null)
				{head=n;prev=head;}
			else{
				prev.next=n;
				prev=n;
			}
	}
	public void view(){
		node iterate=head;
		while(iterate!=null){
			System.out.println(iterate.d);
			iterate=iterate.next;
			
		}
	}
	public void remove(int d,node start,q1 list){
		node prev=null;
		while(start!=null){ 
			
			if(start.d==d)  
				prev.next=start.next;
			else
			prev=start;
		start=start.next;
		}
		
	}
	public static void main(String[]args){
		q1 q=new q1();
		q.add1(2);
		q.add1(13);
		q.add1(33);
		q.add1(23);q.add1(32);q.add1(31);
		q.view();
	}
}
