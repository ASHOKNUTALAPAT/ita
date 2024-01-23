package accenture;

import java.util.Scanner;

/*
 * You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’.
Implement this function to find and return the number of elements of ‘arr’ having an absolute difference 
of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ 
is less than or equal to ‘diff’, return -1.

Example:
Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3

Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 
2 with ‘num’ i.e. 13 are 12, 13 and 14.
 */

public class AbsoluteDiff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		int num=sc.nextInt();
		int diff=sc.nextInt();
		System.out.println(diff(a,a.length,num,diff));
	}
	static int diff(int a[],int len,int num,int diff) {
		int count=0;
		int i=0;
		while(i<len) {
			/*if(num<=a[i]) {
				if(a[i]%num<=diff)
					count++;
			}
			else {
				if(num%a[i]<=diff)
					count++;
			}*/
			if(Math.abs(a[i]-num) <= diff)
				count++;
			i++;
				
		}
		if(count>0)
		return count;
		else
		return -1;
	}

}
