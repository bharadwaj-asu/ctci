package searchandsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


public class q2 {

	public static void main(String[]args){
		String[] array={"cat","div","fik","tac","vid","kif"};
		HashMap<String,ArrayList<String>> map=new HashMap<>();
		for(String s:array)
		{	
			char[] s1=s.toCharArray();
			Arrays.sort(s1);
			String val=Arrays.toString(s1);
		if(!map.containsKey(val)){
			
			
			ArrayList<String>list=new ArrayList<>();
			list.add(s);
			map.put(val,list);
		}
		else
		{
			map.get(val).add(s);
		}
	}
		for(String s:map.keySet()){
			for(String val:map.get(s)){
				System.out.print(val+" ");
			}
			System.out.println();
		}
}
}
