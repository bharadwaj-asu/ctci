package treesndgraphs;

public class q6 {
	  public boolean checkiftreesaresubtrees(node head1,node head2){
		   if (head1==null)
			   return false;
		   else if (head2==null)
			   return true;
		   return(subtree(head1,head2));
	  }

	private boolean subtree(node head1, node head2) {
		// TODO Auto-generated method stub
		if (head1.data==head2.data)
			
		return false;
	}
}
