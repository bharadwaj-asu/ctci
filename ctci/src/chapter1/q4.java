package chapter1;

import java.util.Scanner;
import java.util.Stack;

public class q4 {
	static char[] a;
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		a=sc.next().toCharArray();
		StringBuilder string=new StringBuilder();
		Stack<Character> stack=new Stack();
		char prev=a[0];
		int count=1;
		int i=0;
		for(i=0;i<a.length-1;i++){
			if(stack.isEmpty())
				stack.push(a[i]);
			if(a[i+1]==stack.peek())
				count++;
			else
			{string.append(stack.pop());string.append(count);count=1;}
			
		}
		string.append(a[i]);
		string.append(count);
		System.out.println(string.toString());
}
}
