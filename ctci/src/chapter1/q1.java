package chapter1;
import java.util.HashMap;
import java.util.Scanner;
public class q1 {
static char[] a;
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	a=sc.next().toCharArray();
	int flag=0;
	int [] num=new int[256];
	for (Character c:a){
			num[c]++;
		if(num[c]>1)
			flag=1;
	}
	if (flag==1)
		System.out.println("Characters are not unique");
	else
		System.out.println("Characters are  unique");
}
}
