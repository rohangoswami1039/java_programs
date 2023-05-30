
public class Reverse {

	public void Rev(int n ) {
		int rev_num = 0;
		int m =n ;
		while (n>0) {
			rev_num=rev_num*10+n%10;
			n=n/10;
			
		}
		System.out.println("Entered number is: "+m);
		System.out.println("Reverse of the number is: "+rev_num );
	}
	public static void main(String[]args) {
		Reverse a =new Reverse();
		Reverse b =new Reverse();
		
		a.Rev(325);
		b.Rev(125);
	}
}
