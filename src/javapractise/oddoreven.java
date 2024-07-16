package javapractise;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n= s.nextInt();
		if(n%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
	}
}
