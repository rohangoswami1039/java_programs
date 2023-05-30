

class Average {

    int a, b, c, sum;
    
    void input(int n1,int n2,int n3) {
        a = n1;
        b = n2;
        c = n3;
    }
}

class Main extends Average {

    void add() {
        sum = a + b + c;
        System.out.println("Sum is:" + sum);
    }

    
}
public class Average_using_single_inheritance {
	public static void main(String[] arg) {
        Main obj = new Main();
        obj.input(1,2,3);
        obj.add();
        
    }
}
