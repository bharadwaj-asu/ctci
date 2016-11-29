package linkedlist;
import java.util.HashMap;
import java.util.Scanner;

import linkedlist.*;
public class q1ori {
	public void checkduplicates(q1 list1){
		node iterate=list1.head;
		node prev=null;
		HashMap<Integer,Integer>map=new HashMap<>();
		while(iterate!=null){
			if(!map.containsKey(iterate.d))
			{	map.put(iterate.d,1);
			prev=iterate;}
			else
			{
				prev.next=iterate.next;
			}
			prev=iterate;
			iterate=iterate.next;
		}
	}
	public void checkdupl(node head1){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		node iterate=head1;
		node previous=null;
		while(iterate!=null){
			if(map.containsKey(iterate.d)){
				previous.next=iterate.next;
			}
			else
				{map.put(iterate.d,1);previous=iterate;}
			iterate=iterate.next;
		}
	}
}
