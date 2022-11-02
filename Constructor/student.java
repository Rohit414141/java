class st{
	String name;
	String fname;
	int fees;
	String section;
	String email;
	void show() {
		System.out.println(name);
		System.out.println(fname);
		System.out.println(fees);
		System.out.println(section);
		System.out.println(email);
	}
	st(){
		System.out.println("hi created");
	}
	st(String n , String f,int fe ){
		System.out.println("hi created1");
		name = n;
		fname=f;
		fees = fe;
		
	}
	st(String n , String f,int fe,String s, String e){
		System.out.println("hi created2");
		name = n;
		fname=f;
		fees = fe;
		section = s;
		email=e;
		
	}
}

public class student {

	public static void main(String[] args) {
		st a = new st("rohit","rajesh kumar",103300);
		st b = new st("shyam kumar","ram kumar",103500, "c","kumar@gmail.com");
		st c = new st();
		a.show();
		b.show();
		c.show();
		

	}

}
