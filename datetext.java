package my_mistake;

import java.sql.Date;
import java.util.Scanner;

public class datetext {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = b*24*3600*1000;
		Date m = new Date(a);
		Date n = new Date(c);
		System.out.println(m);
		System.out.print(n);
	}
}
