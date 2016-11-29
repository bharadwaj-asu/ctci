package chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class q3 {
static char [] string1, string2;
public static void main(String[]args){
	HashMap<Character,Integer> map=new  HashMap<Character,Integer>();;
	Scanner sc=new Scanner(System.in);
	string1=sc.next().toCharArray();
	string2=sc.next().toCharArray();
	int flag=0;
	for(char c: string1){
		if(map.containsKey(c))
			map.put(c, map.get(c)+1);
		else
			map.put(c,1);
	}
  for(char c:string2){
	  if(map.containsKey(c)){
		  map.put(c, map.get(c)-1);
	  }
	  else
	  {flag=1;break;}
  }
  if(flag==1)
	  {System.out.println("false");return;}
  
  else{
	  for (Character c:map.keySet()){
		  if(map.get(c)!=0)
			  {System.out.println("false");return;}
	  }}
  
  System.out.println("True");
  }
}
