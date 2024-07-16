package javapractise;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
	int n= s.nextInt();
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
			if(count==2) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not an prime number");
			}
	}}
		