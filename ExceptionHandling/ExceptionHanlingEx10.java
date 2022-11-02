
public class ExceptionHanlingEx10 {

	public static void main(String[] args) {
		int  a = 10 , b =0, c= 0 , d[] = {10,20,30,40,50};
		try {
			c = a/b;
			System.out.println(c);
			System.out.println(d[c]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("exception he");
			System.out.println(ex);
			
		}
		

	}

}


