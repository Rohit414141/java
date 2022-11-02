class R{
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	R(int a, String b){
		x=a;
		y=b;
		System.out.println("hi parmetrized");
	}
	R(){
		System.out.println("hi nonparametrized");
	}
	
	
}
class ConstructerOverloading{
	public static void main(String s[]) {
		R a = new R(20,"ram");
		R b = new R(10,"god");
		R c = new R();
		R d = new R();
		a.show();
		b.show();
		c.show();
		d.show();
		
	}
}