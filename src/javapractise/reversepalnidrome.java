package javapractise;

import java.util.Scanner;

public class reversepalnidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int t=n;
		int rev=0;
		while(n>0) {
			rev=rev*10 + n%10;
			n=n/10;
		}
		if(t==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
	}}


