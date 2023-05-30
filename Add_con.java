class calc
{
	int no1, no2; 
	calc(int a, int b){
	no1 = a;  
	no2 = b;  
	}	 
	public void sum(){
		System.out.println("Sum of "+no1+" and "+no2+" is "+(no1+no2));
	}
}
	
public class Add_con {
	
 public static void main(String[] arg)
	{
	calc c = new calc(30, 10);
	c.sum();
	}
}
		
