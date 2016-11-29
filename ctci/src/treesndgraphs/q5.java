package treesndgraphs;

public class q5 {
	tree t=new  tree();
	public static void main(String[]args){
		q5 q=new q5();
		q.t.insert(10);q.t.insert(15);q.t.insert(1);q.t.insert(5);q.t.insert(12);
		q.t.inorder(q.t.root);
		for (int i=1;i<q.t.list.size();i++){
			if (q.t.list.get(i-1)>q.t.list.get(i))
				System.out.println("NOT a BST");return;
		}
	}
}
