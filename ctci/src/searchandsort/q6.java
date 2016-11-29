package searchandsort;

public class q6 {

	public static void main(String []args){
		int[][]array=
			{ 
					{1,4,8},
					{2,7,9},
					{3,67,121}
		};
		
		int i=0;int j=2;int x=67;
		while(i<=2 && j>=0){
			if(array[i][j]==x){
				System.out.println("found"+" "+i+" "+j);
				return ;
			}
			else if(array[i][j]<x)
				i++;
			else
				j--;
		}
		System.out.println("Not Found");
	}
}
