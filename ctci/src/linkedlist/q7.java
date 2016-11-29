package linkedlist;

import java.util.Scanner;

public class q7 {
 
	public void check_palindrome(q1 list){
		q1 orglist=new q1();
		node current=list.head;
		while(current!=null){
			orglist.add(current.d);
			current=current.next;
		}
		orglist.view(orglist.head);
		if(list.equals(orglist))
			System.out.println("PALINDROME");
		else
			System.out.println("NO");}
	public static void main(String[]args){
		q1 list=new q1();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0){
			int p=sc.nextInt();
			list.add(p);
			n--;
		}
		q7 q=new q7();
		list.view(list.head);
		q.check_palindrome(list);
	}
}
