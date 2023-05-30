
public class Swap_two_number {
	
	public void Swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A >> "+ a);
		System.out.println("B >> "+b);
	}
	
	public static void main(String[] args) {
		Swap_two_number a=new Swap_two_number();
		a.Swap(9, 4);
				
		
	}
	
}
