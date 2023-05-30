
public class Even_odd {

	public void  Even_Odd(int a) {
		if (a%2==0) {
			System.out.println(a+" is Even ");
		}
		else {
			System.out.println(a+" is Odd");
		}
	}
	
	public static void main(String[]args) {
		Even_odd a = new Even_odd();
		a.Even_Odd(20);
		a.Even_Odd(25);
		
	}
}
