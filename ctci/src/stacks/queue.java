package stacks;

public class queue {
 stack stackone,stacktwo;
  public void enqueue(int n){
	  stackone.push(n);
  }
  public void dequeue(){
	  if (stacktwo.top==null){
		  while(stackone.top!=null){
			  stacktwo.push(stackone.pop());
		  }
	  }
  }
  
}
