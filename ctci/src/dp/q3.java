package dp;

public class q3 {
	
	public int search(int[]a,int init,int last){
		int middle=(init+last)/2;
		if(init>last || init<0 )
			return -1;
		else if(a[middle]==middle)
			return middle;
		else if(a[middle]>middle)
			return search(a,init,middle-1);
		else
			return search(a,middle+1,last);
		
	}
	
	public static void main(String[] args){
		q3 q=new q3();
		int []a={-1,0,1,32,5,6,7,8,9,10,11};
		int init=0;
		int last=a.length-1;
		System.out.println(q.search(a, init, last));
	}
}
