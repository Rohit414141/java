class K{
	int x;
	void show() {
		System.out.println(x);
	}
	K(){
		System.out.println("hi A");
	}
	K(int a){this();
		x=a;
		System.out.println("hi B");
	}
}
class ConstructerChaining{
	public static void main(String s[]) {
		K a = new K(20);
		a.show();
		K b = new K();
		b.show();
		
		
		
	}
	
	
	
	
}