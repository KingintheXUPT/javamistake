package my_mistake;

import java.util.Scanner;

public class hasnextAndArrAndString {
	public static void main(String[] args)
	 {

	  Scanner sc=new Scanner(System.in);
	  while(sc.hasNext())
	  {       
	   String s = sc.nextLine();
	   char[] arr = s.toCharArray();
	   System.out.println("¼üÅÌÊäÈëÄÚÈİÊÇ£º"+ new String(arr));
	  }
	 }
}
