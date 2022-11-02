import java.util.Scanner;


class Queue2{
	int f=-1,r=-1;
	int n = 10;
	int q[] = new int[n];
	
	void enqueue() {
		Scanner sc  = new Scanner(System.in);
		if(f==(r+1)%n) {
			System.out.println("overflow:");
		}else {
			System.out.println("Enter the data:");
			int i = sc.nextInt();
			
			if(f==-1 && r==-1)
			{
				r=0;
				f=0;
				q[r] = i;
			}
			else
			{
				r  = (r+1)%n;
				q[r]  =i;
			
			}
		}
		
	}
	
	void dequeue() {
		if(f==-1 && r==-1) {
			System.out.println("underflow:");
		}else if(f==r) {
			System.out.println("underflow:");
			f=-1;
			r=-1;
		}
		
		else {
			f = (f+1)%n;
		}
		
	}
	
	void display() {
		int i;
		System.out.println("items are:");
		for(i=f;i!=r;i=(i+1)%n) {
			System.out.println(q[i]);
		}
		System.out.println(q[i]);
		
	}
	
}
public class CircularQueueUsingArryas26 {
    public static void main(String[] args) {
    	Queue2 s  = new Queue2();
    	int l,d;
    	Scanner sc  = new Scanner(System.in);
    	do
    	{
    	System.out.println("Press 1:Enqueue");
    	System.out.println("Press 2:Dequeue");
    	System.out.println("Press 3:Display");
    	System.out.println("chose any number:");
    	d  = sc.nextInt();
    	switch(d) {
    	
    	case 1:
    		s.enqueue();
    		System.out.println("item inserted:");
    		break;
    		
    	case 2:
    		s.dequeue();
    		System.out.println("item deleted:");
    		break;
      
    	case 3:
    		s.display();
    		break;
    	}
    	System.out.println("press 0 return main menu:");
    	System.out.println("exit press any key:");
    	l = sc.nextInt();
    	
    	
    	}
    	while(l==0);
    	System.out.println("exit successfully:");
		

	}

}
