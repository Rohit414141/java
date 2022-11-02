//
//public class ExceptionHandlingEx7 {
//
//	public static void main(String[] args) {
//		System.out.println("ram");
//		int a = 10 , b = 0 , c = 0 , x[] = {10 , 20 ,30, 40 , 50 };
//		try {
//			c = a/b;
//			System.out.println(c);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("arithmetic errror");
//			// TODO: handle exception
//		}
//		try {
//			System.out.println(x[3]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("exception array");
//		}
//		System.out.println("bye ji");
//	}
//	
//
//}

public class ExceptionHandlingEx7{
	public static void main(String s[]){
		int a = 12 , b = 2 , c = 0 , d[] = {10,20,30,40,50,60,470} ,  e[] = {3,2,3};
		
		try {
			c = a/b;
			System.out.println(c);
		}catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception he  ");
		}
		
		
		try {
			System.out.println(d[c]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index exception");
			
		}
		
		//sum code
		try {
			int sum = 0;
			for(int m:e) {
				sum = sum+m;
				
			}
			System.out.println(sum);
		}catch(Exception ex) {
			System.out.println("eception");
		}
		
		//multiply code
		try {
			int mul = 1;
			for(int m:e) {
				mul = mul*m;
				
			}
			System.out.println(mul);
		}catch(Exception ex) {
			System.out.println("eception");
		}
		//power code
		try {
			int power  = 1 , base = 4;
			for(int i = 1;i<=3;i++) {
				power  = power*base;
			}
			
			
			System.out.println(power);
		}catch(Exception ex) {
			System.out.println("eception");
		}
		
		
	}
}