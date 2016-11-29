package dp;

public class q7 {
	public void Brackets(int n) {
	        Brackets("", 0, 0, n);
	}

	private void Brackets(String output, int open, int close, int pairs) {
		
	    if((open==pairs)&&(close==pairs)) {
	        System.out.println(output);
	    } else {
	        if(open<pairs)
	            Brackets(output + "(", open+1, close, pairs);
	        
	        if(close<open)
	            Brackets(output + ")", open, close+1, pairs);
	        System.out.println("here"+open+close);
	    }
	}
	public static void main(String[]args){
		q7 q=new q7();
		q.Brackets(2);
	}
}
