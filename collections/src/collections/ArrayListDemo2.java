package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String args[]) {
		List<Object> al=new ArrayList<Object>();
		al.add(10); //al.add(new Integer(10));
		al.add("VVIT"); //al.add(new String("VVIT"));
		al.add(10.50);
		System.out.println(al);
		al.add(10);
		al.add(null);
		System.out.println(al);
		al.add(1,'Z');
		System.out.println(al);
	}
	
	
}
