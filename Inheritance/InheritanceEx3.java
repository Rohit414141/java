class Ad{
	int a =10;
	Ad(){
		System.out.println("hi rohit");
	}
	Ad(int x){this();
		a = x; 
		System.out.println("hi lakkhe");
	}
}
class Ae extends Ad{
	int b=20;
	Ae(){super(15);
		System.out.println("extends to");
	}
	Ae(int h){this();
		
		b =h; 
		System.out.println("hi para");
	}
	
}
public class InheritanceEx3 {

	public static void main(String[] args) {
		Ae f = new Ae(30);
		//f.a =500;
		System.out.println(f.a);
		System.out.println(f.b);
		
		

	}

}
