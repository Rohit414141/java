import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
      
//		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
//		int index  = Arrays.binarySearch(numbers, 4);
//		System.out.println(index);// but sort hona chahiye
		
		Integer [] numbers  = {10,5,1,2,25,14,16,18,26,32,13};
	     Arrays.sort(numbers);
	     
	    // Arrays.fill(numbers, 11);
		for(int i:numbers) {
			System.out.print(i+" ");
		}
	}

}
