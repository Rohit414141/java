class B{
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	static {
		System.out.println("hi static");
	}
	B(){
		System.out.println("hi constructer");
	}
}
public class Ex1 {
	public static void main(String[] args) {
		B a = new B();
		B b = new B();
		}
	static {
		System.out.println("hi men class");
	}

}
