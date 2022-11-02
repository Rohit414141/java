class N{
	int x;
	String y;
	void show() {
		System.out.println(x+"\t"+y);
	}
	N(){
		y = "ram kumar";
		System.out.println("hi n1");
	}
}
class ConstructerQues1{
	public static void main(String s[]) {
		N a = new N();
		N b = new N();
		a.x =10; b.x = 20;
		a.y = "rohit";
		a.show();
		b.show();
		
		
	}
}