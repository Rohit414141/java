class A{
	int x;
	String y;
	void show() {
		System.out.println(x+"\t"+y);
	}
	static {
		System.out.println("hi men");
	}
	A(int a, String b){
		System.out.println("hi constructer");
		x = a;
		y = b;
		
	}
}
public class ConstructerEx {

	public static void main(String[] args) {
		A a = new A(10,"rohit");
		A b = new A(20,"lakkhe");
		a.show();
		b.show();
		
	}

}
