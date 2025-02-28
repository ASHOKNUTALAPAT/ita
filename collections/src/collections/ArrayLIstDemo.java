package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIstDemo {

	public static void main(String[] args) {
		List<Object> al=new ArrayList<Object>();
		al.add(10);
		al.add("VIVA");
		al.add(null);
		System.out.println(al);
		al.add(0, "VVIT");
		System.out.println(al);
		
		Iterator i=al.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		for(Object k:al) {
			System.out.println(k);
		}
	}

}
