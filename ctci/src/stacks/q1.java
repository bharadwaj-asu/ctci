package stacks;
class arrayclass{
	int value;
	int stacknum;
	public arrayclass(int val,int stackn)
	{value=val;stacknum=stackn;}
	
}
public class q1 {
	arrayclass[] stacks=new arrayclass[90];
	public void impstack(arrayclass a){
		int i=0;
		if(a.stacknum==1)
		{	
			stacks[i]=a;
		}
		
	}
	public void stackonarray(int i,int stacknum){
		arrayclass a=new arrayclass(i, stacknum);
		impstack(a);
	}
}
