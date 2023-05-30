class prime 
{
	int n1,i,flag; 
	prime(int n){
	
	n1=n;
	
	 for (i = 2; i <= n / 2; ++i) {
		    if (n % i == 0) {
		      flag = 1;
		      break;
		    }
		  }

		  if (n == 1) {
		    System.out.println("1 is neither prime nor composite.");
		  } 
		  else {
		    if (flag == 0)
		    	System.out.println( n+" is a prime number.");
		    else
		    	System.out.println(n+" is not a prime number.");
		  }

}
	
}
public class prime_con {

	public static void main(String[]args) {
		
		prime a = new prime(23);
		prime b = new prime(15);
		
	}

}
