
public class Ex2 {
	 int x ;
	String y ;
	void show() {
		System.out.println(x+y);
	}
	static {
		System.out.println("Hi Rohit");
	}
	static {
		System.out.println("Hi Lakkhe");
	}
	Ex2(){
		System.out.println("hi men");
		x = 10;
		y ="god";
	}
	

	public static void main(String[] args) {
		Ex2 a  = new Ex2();
		Ex2  b =new Ex2();
		a.show();
		b.show();
		
		
		

	}

}
