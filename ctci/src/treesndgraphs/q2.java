package treesndgraphs;
import treesndgraphs.tree;
public class q2 {
	int input[];
	tree t=new tree();
	public node divide(int [] arg,int inital,int fin){
		if(inital>fin)
			return null;
		int middle=(inital+fin)/2;
		node n=new node(arg[middle]);
		n.left=divide(arg,inital,middle-1);
		n.right=divide(arg,middle+1,fin);
		return n;
		}
	public void main(String[]args){
		q2 q=new q2();
		int [] ar={1,2,3,4,5,6,7};
		q.divide(ar,0,6);
		q.t.preorder(q.t.root);
	}
}
