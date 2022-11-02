class CC{
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	CC(int a, String b){this();
		x=a;
		y=b;
		System.out.println("hi para");
		
	}
	CC(){
		System.out.println("chain this");
	}
}
public class ConstructerChaining1 {

	public static void main(String[] args) {
		CC a = new CC(20,"rohit");
		 CC b = new CC (50,"lakkhe");
		CC c = new CC();
		a.show();
		b.show();
		c.show();
		

	}

}
