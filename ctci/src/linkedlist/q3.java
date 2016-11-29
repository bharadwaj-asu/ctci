package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class q3 {
	public void deletemiddle(node middle){
		node Next=middle.next;
		middle.d=Next.d;
		middle.next=Next.next;
	}
	
	}
