package treesndgraphs;

import sun.reflect.generics.tree.Tree;

public class test1 {
	
	public node divide(int initial,int finall,int []arr){
		
		if(initial>finall)
			return null;
		int mid=(initial+finall)/2;
		node ode=new node(arr[mid]);
		ode.left=divide(0,mid-1,arr);
		ode.right=divide(mid+1,finall,arr);
		return ode;
	}
	public static void main(String []args){
		test1 test=new test1();
		tree t=new tree();
		int []aray={1,2,3,4,5,6,7};
		t.insert(4);
		t.insert(2);t.insert(3);t.insert(7);t.insert(1);
		t.inorder(t.root);
		System.out.println(t.balanced(t.root));
		
		
		
	}
}
