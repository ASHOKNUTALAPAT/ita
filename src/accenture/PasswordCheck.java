package accenture;
/*
 * You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. 
Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0
 */

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		String password="";
		Scanner sc=new Scanner(System.in);
		password=sc.next();
		System.out.println(checkPassword(password));
	}
	static int checkPassword(String pass) {
		int len=pass.length();
		if(len<4)
			return 0;
		if(pass.charAt(0)>='0' && pass.charAt(0)<='9')
			return 0;
		int cap=0,num=0,i=1;
		while(i<len) {
			if(pass.charAt(i)==' ' || pass.charAt(i)=='/')
				return 0;
			if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
				cap++;
			if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
				num++;
			i++;
		}
		if(cap>0 && num>0)
			return 1;
		else
			return 0;
		
	}

}
