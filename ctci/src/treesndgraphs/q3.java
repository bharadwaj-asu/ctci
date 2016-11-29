package treesndgraphs;
import java.util.LinkedList;

import linkedlist.*;
public class q3 {
	tree t=new tree();
	LinkedList<Integer> list;
	 
	public void createlinked(){
		t.insert(10);t.insert(11);t.insert(1);t.insert(0);t.insert(3);t.insert(13);t.insert(19);
		int totalheight=t.height(t.root);
		System.out.println(totalheight);
		node p=t.root;
		int i=1;
		while(i<=totalheight){
			list=new LinkedList<Integer>();
			addtolist(p,i);
			System.out.println(list.toString());
			System.out.println(" ");
			i++;
		}
	}
	public void addtolist(node n,int level){
		if (n==null)
			return ;
		if(level==1)
		{System.out.print(n.data+" ");list.add(n.data);}
		else if (level>1)
		addtolist(n.left, level-1);
		addtolist(n.right, level-1);
	}
	public void main(String[]args){
		q3 qu=new q3();
		qu.createlinked();
	}
}
