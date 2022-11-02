class AA{
	int x;
	void show() {
		System.out.println(x);
	}
	AA(){
		System.out.println("non");
	}
	AA(int a){
		x=a;
		System.out.println("para");
	}
	static {
		System.out.println("static");
	}
	{
		System.out.println("inilialize");
	}
	{
		System.out.println("inilialize1");
	}
	
}
public class Initialize2 {

	public static void main(String[] args) {
		AA a = new AA(20);
		a.show();
		AA b = new AA();
		
		

	}

}
