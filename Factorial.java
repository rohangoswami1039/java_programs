
public class Factorial {
 
	public void Fac(int n) {
		int i ,ft=1;
		for(i=1;i<=n;i++) { 
			ft=ft*i;
			
		}
		System.out.println("Factorial of "+n+" is :"+ft);
	}
	
	
	public static void main(String[]args) {
		Factorial a = new Factorial();
		Factorial b = new Factorial();
		
		a.Fac(5);
		b.Fac(2);
 }
}
