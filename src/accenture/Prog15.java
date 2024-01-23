package accenture;

import java.io.File;
import java.util.Scanner;

public class Prog15 {

	public static void main(String[] args) {
		String s;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter file name:");
		s=sc.next();
		File f1=new File(s);
		System.out.println(f1.exists()?"exists":"does not exist");
		System.out.println(f1.canWrite()?"is writable":"is not writable");
		System.out.println(f1.canRead()?"is readable":"is not readable");
		System.out.println(f1.isFile()?"is normal file":"might be a named pipe");
		System.out.println("file size :"+f1.length()+"Bytes");

	}

}
