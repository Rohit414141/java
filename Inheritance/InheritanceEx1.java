class NN{
	//int x = 10;
	 static int x = 10;
	void show() {
		System.out.println("hi A");
	}
}
class NNN extends NN{
	int y = 50;
	void display() {
		System.out.println("hi b");
	}
}
class InheritanceEx1{
	public static void main(String s[]) {
		NN a = new NN();
		a.x = 20;
		System.out.println(a.x);
		NN b = new NN();
		a.x=22;
		System.out.println(a.x);
		a.show();
		
		
		NNN c = new NNN();
		c.x = 24;
		System.out.println(c.x);
		c.show();
		c.y = 100;
		System.out.println(c.x);
		c.display();
		
		
	}
}