package javapractise;

public class separatedigitsfromnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n= 35246;
int count=0;
 while(n>0) {       
	//to find length of n
	n= n / 10;
	count++;
}

System.out.println(count);
	}

}
