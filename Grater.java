
public class Grater {

	public void High(int n,int m ,int p) {
		if(n>m && n>p) {
			System.out.println(n+" is grater");
		}
		else if (m>n && m>p){
			System.out.println(m+" is Grater");
		}
		else 
			System.out.println(p+" is Grater"); 
	}
	
	public static void main(String[]args) {
		Grater a =new Grater();
		a.High(45, 0, 250);
	}
}
