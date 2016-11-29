package dp;

public class q1 {
	
	public int ways(int n){
		if (n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3)
			return 4;//1111,121,13,211,31,112,22
		return ways(n-2)+ways(n-3)+ways(n-1);
	}
	public int countway(int n,int map[]){
		System.out.println(n);
		if (n==1)
			return map[0]=1;
		if(n==2)
			return map[1]=2;
		if(n==3)
			return map[2]=4;
		map[n-1]=countway(n-1,map)+countway(n-2,map)+countway(n-3,map);
		return map[n-1];
		
	}
	
	public static void main(String []args){
		q1 q=new q1();
		int []map=new int[5];
		System.out.println("q"+q.countway(5, map));
	}
}

