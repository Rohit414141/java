//multiple method same  and augument same 
// iheritance is compelsalry

class Car{
	public void drive() {
		System.out.println("Drive the car!!");
	}
}
class Audi extends Car{
	public void drive() {
		System.out.println("Drive the Audi!!");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Car a  = new Car();
		a.drive();
		Car b  = new Audi();
		b.drive();
		

	}

}
