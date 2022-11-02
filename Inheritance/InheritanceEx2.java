class AB{
	private int x = 10;
	int z = 20;
	void show() {
		System.out.println("hi a");
	}
	void printx() {
		System.out.println(x);
	}
}
class AC extends AB{
	int y = 22;
	void display() {
		//System.out.println(x);
		System.out.println(z);
		printx();
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		AC a = new AC();
		//System.out.println(a.x); // error he private
		System.out.println(a.z);
		a.printx();
		a.show();
		a.printx();
		a.display();
		
	}

}
