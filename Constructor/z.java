class m{
	int x;
	String  y ;
	void show() {
		System.out.println(x+y);
	}
	static {
		System.out.println("Hi Programmer");
	}
	m(){
		System.out.println("hello z");
		 y = "Ram kumar";
	}
}
public class z{
	public static void main(String[]s) {
		m a  = new m();
		a.show();
		m b = new m();
		a.x = 10; b.x = 52;
		a.y = "ham"; 
		a.show();
		b.show();
		
	}
	static {
		System.out.println("hi men");
	}
	
}




