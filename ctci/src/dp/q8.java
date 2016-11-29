package dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class q8 {
	// create a new locale
	public static void main(String []args){
		Map<String, String> countries = new HashMap<>();
		Map<String, String> codes = new HashMap<>();
	    for (String iso : Locale.getISOCountries()) {
	        Locale l = new Locale("", iso);
	        countries.put(l.getDisplayCountry(), iso);
	    }
	    
	    for(String s:countries.keySet())
	    {
	    	Locale l=new Locale(" ",countries.get(s));
	    	codes.put(s,l.getISO3Country());
	    }
	    for(String p:codes.keySet())
	    System.out.println(codes.get(p));
}
}