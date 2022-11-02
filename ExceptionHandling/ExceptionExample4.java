public class ExceptionExample4{
	public static void main(String s[]) {
		System.out.println("hello");
		//String b = "123gh";
		String b = "123";
		try {
			int c = Integer.parseInt(b);
			System.out.println(c);
		}catch(NumberFormatException e) {
			System.out.println("exception he");
			
		}
		System.out.println("bye");
	}
	
}
