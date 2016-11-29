package genrics;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class linkelist {
	static LinkedList<Integer>  list;
	public static void main(String[]args){
		list=new LinkedList<>();
		list.add(1);list.add(2);list.add(5);list.add(6);list.add(7);
		Iterator it=list.iterator();
		ListIterator lit=list.listIterator();
		while(lit.hasNext()){
			it.next();
		}
	}
}
