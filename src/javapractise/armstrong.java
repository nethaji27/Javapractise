package javapractise;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n= 370;
int b=n;
int sum=0;
while(n>0) {
	sum=sum+(n%10)*(n%10)*(n%10);
	n=n/10;
}

 if(sum==b) {
	System.out.println("armstrong");
}
else {
	System.out.println("not an armstrong");
}
	}

}
