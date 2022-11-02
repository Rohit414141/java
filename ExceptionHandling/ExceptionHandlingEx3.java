public class ExceptionHandlingEx3{
	public static void main(String s[]) {
		System.out.println("hi");
		String a = null;
		try {
		System.out.println(a.toUpperCase());
			
			
			
		} catch (NullPointerException e) {
			System.out.println("exception not store value nonStatic");
		}
		System.out.println("bye");
	}
}

