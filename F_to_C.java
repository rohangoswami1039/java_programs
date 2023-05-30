
public class F_to_C {
	
	public void Convert(int a) {
		int b ;
		b=((a-32)*5)/9;
		System.out.println("C >> "+b);
	}
	
	public static void main(String[]args) {
		F_to_C a=new F_to_C();
		a.Convert(32);
		a.Convert(45);
	}
	
}
