class Area
	{
	    void area(float x)
	    {
	        System.out.println(" square is "+Math.pow(x, 2)+" sq units");
	    }
	    void area(float x, float y)
	    {
	        System.out.println("rectangle is "+x*y+" sq units");
	    }
	    void area(double x)
	    {
	        double z = 3.14 * x * x;
	        System.out.println("circle is "+z+" sq units");
	    }
	}
public class Area_using_overloading {

	    public static void main(String[] args)
	    {
	       Area b = new Area();
		   b.area(4);
		   b.area(10,12);
		   b.area(5.5);
	    }
	}
	

