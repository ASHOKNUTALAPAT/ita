package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			arrayList.add(i);
		System.out.println(arrayList);
		Iterator<Integer> it=arrayList.iterator();
		while(it.hasNext()) {
			Integer a=it.next();
			if(a%2==0)
				System.out.println(a);
			else
				it.remove();
		}
		System.out.println(arrayList);

	}

}
