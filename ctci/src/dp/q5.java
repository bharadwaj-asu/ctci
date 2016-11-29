package dp;

public class q5 {
	
	public static void printSubsets(char set[])
    {
        int n = set.length;
        int p=1<<n;
 
        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0; i < (p); i++)
        {
            System.out.print("{ ");
 
            // Print current subset
            for (int j = 0; j < n; j++)
            {
            	int q=1<<j;
            	int q1=i&q;
                if (q1 > 0)
                    System.out.print(set[j] + " ");}
 
            System.out.println("}");
        }
    }
	 
	public static void main(String []args){
		char set[] = {'a', 'b', 'c'};
        printSubsets(set);
	}
	
}
