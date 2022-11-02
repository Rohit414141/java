
public class ExceptionExample8 {

	public static void main(String[] args) {
		System.out.println("ram");
		int a = 10 , b = 0 , c = 0 , y[] = {10,20,30,40,50,60};
		try {
			c = a/b;
			System.out.println(c);
			System.out.println(y[c]);
		} catch (ArithmeticException e) {
			System.out.println("arithe exception");
			
		}catch(ArrayIndexOutOfBoundsException z) {
			System.out.println("arrayException");
			
		}

	}

}
