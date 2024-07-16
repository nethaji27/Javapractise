package javapractise;

import java.util.Arrays;

public class april_2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] a= {1,423,6,46,34,23,13,53,4};
 int max=a[0];
 int min=a[0];
	for(int i=1;i<a.length;i++) {
		
		if(a[i]>max) {
			max=a[i];
		}
		if(a[i]<min) {
			min=a[i];
		}
		}
	System.out.println("maximum number is:"+ max );
	System.out.println("minimum number is:"+ min);

	Arrays.sort(a);
	System.out.println("min-"+ a[0]+"max-"+a[a.length-1] );
	
	}

}
