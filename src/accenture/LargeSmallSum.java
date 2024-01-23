package accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargeSmallSum {
	static int largeSmallSum(int arr[]) {
		if(arr==null || arr.length<=3)
			return 0;
		List<Integer> odd=new ArrayList<Integer>();
		List<Integer> even=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				even.add(arr[i]);
			else
				odd.add(arr[i]);
		}
		Collections.sort(even);
		Collections.sort(odd);
		System.out.println(even);
		System.out.println(odd);
		return even.get(even.size()-2)+odd.get(1);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println(largeSmallSum(a));
	}

}
