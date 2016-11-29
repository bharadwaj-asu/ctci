package searchandsort;

public class q3 {
	
	public boolean binarysearch(int []a,int low,int high,int k){
		int mid=(low+high)/2;
		if(a[mid]==k)
			return true;
		if(a[low]>a[mid]){
			if(k>a[mid] && k<=a[low]){
				binarysearch(a,low,mid-1,k);
			}
			if(k<a[mid]&& k>=a[high]){
				binarysearch(a,mid+1,high,k);
			}
				
		}
		if(a[high>])
		
	}
	public static void main(String[]args){
		int []a={7,6,5,1,2,3,4};
		
	}
}
