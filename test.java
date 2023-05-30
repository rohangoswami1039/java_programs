class Calc 
{

	int num1;
	int num2;
	int result;
	
	void perform() {
		result=num1+num2;
		System.out.println(result);
	}

}

public class test {


	public static void main(String[] arg) {

		Calc obj = new Calc();
		obj.num1=1;
		obj.num2=2;
		System.out.println(obj.result);
		obj.perform();
	}
}
