class NN{
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	NN(int a,String b){
		x=a;
		y=b;
		System.out.println("hi parametrized cons");
	}
}
public class ParametrizedConstructer1 {

	public static void main(String[] args) {
		NN a = new NN(20,"rohit");
		NN b = new NN(30,"lakkhe");
		//b.x = 10; b.y = "ham";// parametrized ki value change karne ke liye 
		
		a.show();
		b.show();
		
	}

}
