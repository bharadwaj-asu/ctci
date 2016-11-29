package linkedlist;

import java.util.Scanner;

public class q6 {
	public void findloop(node head){
		node current=head;
		node currentfast=head.next;
		while(current!=currentfast){
			current=current.next;
			currentfast=currentfast.next;
		}
		System.out.println(current.d);
		}
	
}
