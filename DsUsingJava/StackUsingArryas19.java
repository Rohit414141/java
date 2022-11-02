import java.util.Scanner;

//stack is a linear data structure.

/*
 stack used lifo esme direct koi value nhi delete kar sakte he esme last se delete hoga random nhi karsakte he 
 to se hi hogi delete.
 */

class stack  {      
	int top = -1;
	int n = 10;
	int a[] = new int[n];
	
	void push() {
		if(top==(n-1)) {
			System.out.println("overflow");
		}else {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter the item:");
			int i = sc.nextInt();
			top = top+1;
			a[top] = i;
			System.out.println("item inserted:");
			
			
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("underflow:");
		}else {
			top = top-1;
			System.out.println("item deleted");
		}
	}
	
	void display() {
		for(int j = top;j>=0;j--) {
			System.out.println(a[j]);
		}
	}
	
}
 
public class StackUsingArryas19 {
	  
public static void main(String[] args) {
  stack s1  = new  stack();
  Scanner sc  = new Scanner(System.in);
  int d;
  int l;
  do
  {
  System.out.println("press 1 push");
  System.out.println("press 2 pop");
  System.out.println("press 3 display");
  System.out.println("chose your choice");
  d = sc.nextInt();
  switch(d) {
  case 1:
	  s1.push();
	  break;
  case 2:
	  s1.pop();
	  break;
	  
  case 3:
	  s1.display();
	  break;
  
  
  }
  System.out.println("enter 0 to back main menu add another item:");
  System.out.println("enter any key to exit:");
  l = sc.nextInt();
  }
  
  while(l==0);
  System.out.println("exit successfully:");
  	
}
}


