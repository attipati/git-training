package suneel;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number a:");
		int a=sc.nextInt();
		System.out.println("enter the number b:");
		int b=sc.nextInt();
		System.out.println("sum  = " + (a+b));
		System.out.println("sub  = " +(a-b));
		System.out.println("mul  ="+(a*b));
		System.out.println("div  =" +(a/b));
	}
}

		