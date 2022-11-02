class AAA{
	private int x=10;
	int z=30;
	void show() {
		System.out.println("Hello A");
	}
	void printX() {
		System.out.println(x);
	}
}
class BB extends AAA{
	int y=20;
	void display() {
		System.out.println("Hello B");
		//System.out.println(x);//error
		printX();
		System.out.println(z);
	}
}
public class Ex4 {
	public static void main(String[] args) {
		BB b=new BB();
		System.out.println(b.z);
		//System.out.println(b.x);//error
		b.printX();
	}
}