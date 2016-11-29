package genrics;
class linkedlist{
	node head=null;
	class node{
		int num;
		node next;
		public node(int num){
			this.next=null;
			this.num=num;
		}
	}
	public void add(int i){
		node b=new node(i);
		node conter=null;
		if(head==null){
			head=b;
			conter=head;
	}
		else{
			conter.next=b;
			conter=b;
		}
	}
	
}
 interface queuelist {
	void enqueue(int a);
	int dequeue(int b);
}
 public class queue {
	 linkedlist l1=new linkedlist();
	 public static void main(String[]args){
		 queuelist qu=(queuelist) new linkedlist();
		 
	 }
 }