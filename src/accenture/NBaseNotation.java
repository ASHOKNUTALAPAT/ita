package accenture;

import java.util.Scanner;

public class NBaseNotation {
	
	static String DectoNBase(int base,int num) {
		String res="";
		int q=0;
		int rem=0;
		while(num>0) {
			rem=num%base;
			if(rem>9) {
				res=(char)(rem+55)+res;
			}
			else
				res=rem+res;
			num=num/base;
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int num=sc.nextInt();
		System.out.println(DectoNBase(base,num));

	}

}
