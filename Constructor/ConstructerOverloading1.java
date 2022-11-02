class c{
	String name;
	int salary;
	String cname;
	void show() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(cname);
	}
	void m() {
		System.out.println("The end");
	}
	static {
		System.out.println("hi static");
	}
	c(String n,int s,String c){
		name = n;
		salary = s;
		cname= c;
		System.out.println("hi constructer");
	}
	c(){
		System.out.println("hi empty");
	}
	
}
public class ConstructerOverloading1 {

	public static void main(String[] args) {
		
		c a  = new c("rohit",250000,"amazon");
		c b = new c("kaushal",200000,"flipkart");
		c c = new c();
		a.show();
		b.show();
		a.m();
		
		
		

	}
	static {
		System.out.println("Starting");
	}

}
