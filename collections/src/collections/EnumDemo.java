package collections;

import java.util.Enumeration;
import java.util.Vector;
public class EnumDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		System.out.println(v);
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		

	}

}
