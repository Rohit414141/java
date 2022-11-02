import java.util.ArrayList;

class Emp{
	String name,cname;
	int age;
	
	Emp(String name,String cname,int age){
		this.name=name;
		this.cname=cname;
		this.age=age;
		
	}
	
	public String toString() {
		return name+" "+cname+" "+age;
	}
	
}
public class UserDefineClass5 {
	
	public static void main(String[] args) {
		
		ArrayList<Emp> arraylist  = new ArrayList<Emp>();
		Emp e1 = new Emp("Rohit","abc",21);
		Emp e2  = new Emp("lakkhe","pqr",23);
		Emp e3  = new Emp("sachin","mns",25);
		//e1.name="ram";
		//e2.name="sita";
		//e3.name="shyam";
		arraylist.add(e1);
		arraylist.add(e2);
		arraylist.add(e3);
		System.out.println(arraylist);
		
		
	}

}
