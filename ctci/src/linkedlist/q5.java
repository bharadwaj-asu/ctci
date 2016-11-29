package linkedlist;

public class q5 {

	public void add(node head1,node head2){
		node current1=head1;
		node current2=head2;
		int i=0,sum=0,sum1=0,rem=0;
		StringBuilder total=new StringBuilder();
		while(current1!=null && current2!=null){
			sum=current1.d+current2.d+sum1;
			
					sum1=sum/10;
					sum=sum%10;
					total.append(String.valueOf(sum));
				i++;
				current1=current1.next;
				current2=current2.next;
		}
		if(current1!=null && current2==null){
			sum=current1.d+sum1;
			total.append(String.valueOf(sum));
		}
		else if(current1==null && current2!=null){
			sum=current2.d+sum1;
			total.append(String.valueOf(sum));
		}
		else
			total.append(String.valueOf(sum1));
		//total.append(String.valueOf(sum1));
		System.out.println(total.reverse().toString());
	}
	public  static void main(String[]args){
		q1 linkedlist=new q1();
		q1 linkedlist1=new q1();
		linkedlist.add(2);
		linkedlist.add(9);
		linkedlist1.add(6);
		linkedlist1.add(1);
		linkedlist1.add(7);
		linkedlist.view();
		linkedlist1.view();
		q5 q=new q5();
		q.add(linkedlist.head,linkedlist1.head);
	}
}
