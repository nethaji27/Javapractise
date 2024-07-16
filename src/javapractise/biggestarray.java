package javapractise;

public class biggestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {20,30,40,50};
int biggest= Integer.MIN_VALUE;
int i=0;
while(i<a.length) {
	if(a[i]>biggest) {
		biggest= a[i];
	}
	i=i+1;
}
System.out.println(biggest);
	}

}
