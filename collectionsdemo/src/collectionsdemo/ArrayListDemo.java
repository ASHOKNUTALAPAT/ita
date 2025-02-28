package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Object> al=new ArrayList<Object>();
		al.add(10); //al.add(new Integer(10));
		al.add("VVIT"); //al.add(new String("VVIT"));
		al.add('Z'); //al.add(new Character('Z'));
		System.out.println(al);
		
		al.add(0, 22.22);
		al.addLast(null);
		System.out.println(al);
		al.addFirst(null);
		al.add(2, 10);
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
	}

}
