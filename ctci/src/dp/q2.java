package dp;

public class q2 {

	public int way(int [][]a,int x,int y){
		if(x<0 || y<0)
			return a[0][0]=0;
		else if(x==0 && y==0)
			return a[0][0]=0;
		else if(x==0 && y==1)
			return a[0][1]=1;
		else if(x==1 && y==0)
			return a[1][0]=1;
		else 
		{
			a[x][y]=way(a,x,y-1)+way(a,x-1,y);
			System.out.println(a[x][y]+" ");
		return a[x][y];}
		
	}
	public static void main(String[]args){
		q2 q=new q2();
		int [][]a=new int[2][7];
		System.out.println(q.way(a,1, 6));
	}
}
