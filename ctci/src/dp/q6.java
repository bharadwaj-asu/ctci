package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q6 {
	public static void permutation(char[]args,int k,int n){
		if(k==n) System.out.println(Arrays.toString(args));
		else{
			for(int i=k;i<=n;i++){
				char t=args[i];args[i]=args[k];args[k]=t;
				permutation(args, k+1, n);
				t=args[i];args[i]=args[k];args[k]=t;

			}
		}
		
	}
	public static void main(String[]args){
		q6.permutation("abc".toCharArray(),0,2);
	}
}
