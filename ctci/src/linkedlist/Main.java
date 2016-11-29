import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;

import com.sun.corba.se.spi.ior.MakeImmutable;

public class Main {
	public String make(String s){
		StringBuilder s1=new StringBuilder(s.trim());
		String p=s1.toString();
		String p1=p.trim();
		String p2=p1.replaceAll("\\s+"," ");
		char[] p3=p2.toCharArray();
		for(char c:p3){
			if(Character.isLetterOrDigit(c))
				s1.append(c);
		}
		return s1.toString();
	}
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    Main main=new Main();
    TreeMap<String,Integer> map=new TreeMap(String.CASE_INSENSITIVE_ORDER);
    while ((s = in.readLine()) != null) {
    	String mod=main.make(s);
    	if(!map.containsKey(mod))
      map.put(s,s.length());
    }
    int length=100;
    String answer="";
    for(String key:map.keySet()){
    	
    	if(map.get(key)<length)
    }
  }
}
