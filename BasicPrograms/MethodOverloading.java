//Multiple method same name different augument
// inheritance is not complesary

public class MethodOverloading {
	public void add(int  a, int b) {
		int result1  = a+b;
		System.out.println(result1);
	}
	
	public void add(int  a, int b,int c) {
		int result2  = a+b+c;
		System.out.println(result2);
	}
	
	
	
	public void add(double a, double b) {
		double result3  = a+b;
		System.out.println(result3);
	}
	public static void main(String[] args) {
		MethodOverloading a  = new MethodOverloading();
		a.add(10, 20);
		a.add(10, 20,30);
		
		a.add(10.2, 25.3);
		
	}

}
