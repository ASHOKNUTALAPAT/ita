package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println(arrayList);
		Iterator<Integer> it=arrayList.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			if(i%2==0)
				System.out.println(i);
			else
				it.remove();
		}
		System.out.println(arrayList);
	
		}
}
