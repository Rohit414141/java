public class ExceptionHandlingEx1{
	public static void main(String s[]) {
		System.out.println("hello");
		int a = 12 , b = 2 , c;
		try {
			c = a/b;
			System.out.println(c);
			
		} catch (Exception ex) {
			System.out.println("exception he");
		}
		System.out.println("bye");
	}
	
}