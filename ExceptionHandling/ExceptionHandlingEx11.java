public class ExceptionHandlingEx11 {

	public static void main(String[] args) {
		
		int a = 10, b = 0 , c =0, d[] = {10,20,30,40,50};
		try {
			c=a/b;
			System.out.println(c);
		}catch(NullPointerException ex) {
			System.out.println("catch");
		}
		finally {
			System.out.println("final");
		}
		

	}

}
