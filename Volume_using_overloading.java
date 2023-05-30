class Volume {
	void volume(int a ) {
		System.out.println("Volume of cube is "+Math.pow(a, 3)+" cubic units");
	}
	void volume(int r,int h) {
		double v = 3.14*Math.pow(r, 2)*(h/3);
		System.out.println("volume of cone is "+v); ;
	}
}


public class Volume_using_overloading {

	public static void main(String[]args) {
		Volume a = new Volume();
		a.volume(25);
		a.volume(25, 3);
	}
}
