
public class ArmastrongNumber {

	public static void main(String[] args) {
		int n=371;
		int temp=n;
		int r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum = sum+r*r*r;
		}
		if(sum==temp) {
			System.out.println("Armastrong");
		}else
			System.out.println("not armstrong");
		
		
		
		
		
	}

}


