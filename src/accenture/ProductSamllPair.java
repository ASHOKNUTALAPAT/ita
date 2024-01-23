package accenture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductSamllPair {
	static int productSmallPair(int sum, int arr[]) {
		if(arr==null || arr.length<2)
			return -1;
		List<Integer> list=new ArrayList<Integer>();
		for(int i:arr) {
			list.add(i);
		}
		Collections.sort(list);
		
		return list.get(0)+list.get(1)<sum?list.get(0)*list.get(1):0;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=s.nextInt();
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(productSmallPair(sum,arr));
	}

}
