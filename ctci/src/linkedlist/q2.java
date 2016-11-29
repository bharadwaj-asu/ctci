 package linkedlist;

import java.util.Scanner;

public class q2 {
	node start;
	node startnext;
	public void kthelem(int k,node st){	
		start=startnext=st;
		for(int i=0;i<k;i++){
			startnext=startnext.next;
		}
		while(startnext.next!=null){
			start=start.next;
			startnext=startnext.next;
		}
		System.out.println(start.d);
	}
	
}
