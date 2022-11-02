class A{
	
}
class B extends A{
	
}
public class ExceptionHandlingEx6{
	public static void main(String s[]) {
		System.out.println("ram");
		try {
			A a = new A();
			B b = (B)a;
			System.out.println("ya downCasting");
		} catch (ClassCastException e) {
			System.out.println("exception he");
		}
		System.out.println("bye");
	}
	
}