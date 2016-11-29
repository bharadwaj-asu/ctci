package searchandsort;

public class q1 {

	public static void main(String[]args){
		int a[]=new int[10];
		int b[]={2,4,6,8,10};
		a[0]=1;a[1]=3;a[2]=5;a[3]=7;a[4]=9;
		int i=4;int j=b.length-1;int k=4+j+1;
		while(i>=0&& j>=0){
			if(a[i]>b[j])
				a[k--]=a[i--];
			else
				a[k--]=b[j--];
			}
		while(k>=0 &&j>=0){
			a[k--]=b[j--];
		}
		for(Integer p:a){
			System.out.print(p+" ");
		}
		
	}
}
