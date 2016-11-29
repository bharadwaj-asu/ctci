package linkedlist;

import java.util.Scanner;

public class q4 {
	public void partition(int n,node hea){
		node current=hea;
		node currentother=hea;
		q1 listnew=new q1();
		while(current!=null){
			if(current.d<n){
				listnew.add(current.d);
			}
			current=current.next;
		}
		listnew.add(n);
		while(currentother!=null){
			if(currentother.d>n){
				listnew.add(currentother.d);
			}
			currentother=currentother.next;
		}
		listnew.view();
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		q1 list=new q1();
		while(n>0){
			int p=sc.nextInt();
			list.add(p);
			n--;
		}
		list.view();
		q4 q=new q4();
		q.partition(4,list.head);
	}
}
