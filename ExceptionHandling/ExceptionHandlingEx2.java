public class ExceptionHandlingEx2{
	public static void main(String s[]) {
		System.out.println("hello");
		int a[] = {10,20,30,40,50};
		try {
			System.out.println(a[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception he ");
			// TODO: handle exception
		}
		System.out.println("bye");
	}
}
