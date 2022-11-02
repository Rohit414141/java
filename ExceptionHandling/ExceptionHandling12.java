class Student{
	private int age;
	public void setAge(int a) {
		
		
		if(a>0) {
			age =a;
			
			
		}else {
			throw new ArithmeticException("invalid");
		}
	}
	public int getAge() {
		return age;
		
	}
	
}
public class ExceptionHandling12{
	public static void main(String s[]) {
		try{
			Student a = new Student();
		
		a.setAge(-12);
		System.out.println("your age"+ a.getAge());
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	
}