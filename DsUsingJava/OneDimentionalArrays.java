import java.util.Scanner;

public class OneDimentionalArrays {

	public static void main(String[] args) {
		int n;
	System.out.println("Enter the size:");
	Scanner sc  = new Scanner(System.in);
	 n = sc.nextInt();
	int arr[] = new int [n];
	System.out.println("Enter the values:");
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println("print the values:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	

	}

}
