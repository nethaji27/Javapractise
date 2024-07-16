package javapractise;

import java.util.Scanner;

public class maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n=s.nextInt();
int max=n%10;
while(n>0) {
	if(n%10>max) {
		max=n%10;
	}
	n=n/10;
}
System.out.println(max);
	}

}
