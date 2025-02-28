package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemi {

	public static void main(String[] args) {
		List<Object> ll=new LinkedList<Object>();
		ll.add(11);
		ll.add("VIVA");
		ll.add(22.22);
		System.out.println(ll);
		ll.set(0, 111);
		System.out.println(ll);
		ll.set(1, "HAI");
		ll.removeLast();
		System.out.println(ll);

	}

}
