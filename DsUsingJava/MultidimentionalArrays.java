import java.util.Scanner;
// user input
public class MultidimentionalArrays {

	public static void main(String[] args) {
	int n,m;
	System.out.println("Enter the row:");
	Scanner sc  = new Scanner(System.in);
	n = sc.nextInt();
	System.out.println("Enter the column:");
	m =sc.nextInt();
	int arr[][] = new int[n][m];
	System.out.println("Enter the values:");
	for(int i=0;i<n;i++) {
		System.out.println("Enter the column values:"+i);
		for(int j=0;j<m;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("print the values:");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");

			
		}
		System.out.println();
	}

	}

}
