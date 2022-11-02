class Employee{
	String name;
	String fname;
	String cname;
	int salary;
	String email;
	void show() {
		System.out.println(name+"\t"+fname+"\t"+cname+"\t"+salary+"\t"+email);
	}
	Employee(){
		System.out.println("hi sachin");
	}
	Employee(String n, String f,String c){
		name = n;
		fname = f;
		cname = c;
		System.out.println("half datails ");
	}
	Employee(String n, String f,String c,int s,String e){
		this(n,f,c);
		salary = s;
		email = e;
		System.out.println("full details");
		
	}
	static {
		System.out.println("hi employee");
	}
	void m() {
		System.out.println("hi method");
	}
	
		{
		System.out.println("good morning");
	}
	
}
class W{
	String nm;
	String fn;
	int sa;
	void show() {
		System.out.println(nm+fn+sa);
	}
	W(){
		System.out.println("hi local");
		
	}
	W(String nn,String ff,int ss){
		nm = nn;
		fn = ff;
		sa = ss;
		System.out.println("hi local 2");
		
	}
	{
		System.out.println("local");
	}
	
}
public class OmLogistics {

	public static void main(String[] args) {
		Employee a = new Employee();
		Employee b = new Employee("sachin mishra","kamlesh mishra","Om");
		Employee c = new Employee("mohit kumar","jaghh jkhgf","JJcc");
		Employee d = new Employee("sachin kumar","kamlesh mishra","Om",50000,"sachin@gmail.com");
		a.show();
		b.show();
		c.show();
		d.show();
		a.m();
		W cc = new W();
		W dd  = new W("rombo","kombo",120);
		cc.show();
		dd.show();
	}

}
