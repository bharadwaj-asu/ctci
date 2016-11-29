package stacks;

import java.util.ArrayList;
public class q3 {
	ArrayList<stack> setof=new ArrayList<stack>();
	int count=0;
	int threshold=3;
	int index=0;
	static stack st=new stack();
	public void push(int i){
		
		if(count!=0 && count%threshold==0){
			setof.add(index,st);
			index=index+1;
			st=new stack();
		}
			st.push(i);	
		count=count+1;
	} 
	public int pop(){
		if(count<=0)
			return -1 ;
		stack newone=setof.get(index);
		int ret=newone.pop();
		setof.remove(index);
		count=count-1;
		if(count%threshold!=0)
			setof.add(newone);
		
		else{
			index=index-1;
		}
		
		return ret;
	}
	public void popat(int i){
		stack toop=setof.get(i);
		int toret=toop.pop();
		if(i!=index){
			while(i<=index){
				stack toreplace=setof.get(i);
				setof.add(i);
			}
		}
		
	}
	public static void main(String [] args){
		q3 q=new q3();
		q.push(3);
		q.push(4);q.push(5);q.push(6);q.push(7);q.push(8);q.push(9);
		q.setof.add(st);
		System.out.println(q.setof.size());
		System.out.println( q.pop());
		System.out.println( q.pop());System.out.println( q.pop());System.out.println( q.pop());
	}
}
