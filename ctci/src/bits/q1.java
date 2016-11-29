package bits;

public class q1 {
 static int n= 2^10;
 static int m=19;
 static int j=2;
static int i=6;
 public static void main(String[] args){
	 int mask=~0;
	 System.out.println(Integer.toBinaryString(mask));
	 int left=mask<<(i+1);
	 System.out.println(Integer.toBinaryString(left));
	 int right=(1<<j)-1;
	 System.out.println(Integer.toBinaryString(right));
	 int effective=left | right;
	 System.out.println(Integer.toBinaryString(effective));
	 System.out.println(effective);
	 System.out.println(Integer.toBinaryString((n&effective)|(m<<j)));
	
	 
 }
}
