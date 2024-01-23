package accenture;

import java.util.Scanner;

public class NumberOfCarries {
	static int numberOfCarries(int num1,int num2) {
		int carry_count=0;
		String res="";
		int rem1=0;
		int rem2=0;
		int carry=0;
		int temp_sum=0;
		while(num1>0 && num2>0) {
			rem1=num1%10;
			rem2=num2%10;
			if(rem1+rem2+carry>9) {
				temp_sum=rem1+rem2+carry;
				carry=temp_sum/10;
				res=temp_sum%10+res;
				carry_count++;
			}
			else {
				res=(rem1+rem2+carry)+res;
				carry=0;
			}
			num1=num1/10;
			num2=num2/10;
		}
		while(num1>0) {
			rem1=num1%10;
			if(rem1+carry>9) {
				temp_sum=rem1+carry;
				carry=temp_sum/10;
				res=temp_sum%10+res;
				carry_count++;
			}
			else {
				res=(rem1+carry)+res;
				carry=0;
			}
			num1=num1/10;
		}
		while(num2>0) {
			rem2=num2%10;
			if(rem2+carry>9) {
				temp_sum=rem2+carry;
				carry=temp_sum/10;
				res=temp_sum%10+res;
				carry_count++;
			}
			else {
				res=(rem2+carry)+res;
				carry=0;
			}
			num2=num2/10;
		}
		if(carry>0)
			res=carry+res;
		System.out.println(res);
		return carry_count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(numberOfCarries(num1,num2));

	}

}
