package genrics;

public class genric <T> {
private T first,second;
public genric(T first,T second){
	this.first=first;
	this.second=second;
}
public T get(){
	return second;
	
}
public void set(T first){
this.first=first;
}
}
