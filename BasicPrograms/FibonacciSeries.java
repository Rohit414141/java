public class FibonacciSeries{
	int a=-1,b=1,c,sum=0;
	void fibonacci(int n) {
		while(n>=0) {
		c=a+b;
		System.out.println(c+" "); // fibonacci seris 
		
		
//		for(int j=0;j<c;j++) {
//			System.out.print("*");// * pattern fibonacci series
//			
//		}
//		System.out.println();
		a=b;
		b=c;
		n--;
		}
		
	}
	public static void main(String s[]) {
		FibonacciSeries obj = new FibonacciSeries();
		obj.fibonacci(7);		
	}
	
}