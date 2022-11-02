
public class ExceptionHandlingEx9 {

	public static void main(String[] args) {
		int  a = 12 , b = 0 , c=0, x[] = {10,20,3,040,50,60};
		try {
			c =a/b;
			System.out.println(c);
			System.out.println(x[c]);
		}catch(Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
			//System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		
		}

	}

}
