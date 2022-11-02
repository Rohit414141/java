import java.util.*;
public class LearnPriorityQueue {/* priority queue use hota he max heap and min head me */

	public static void main(String[] args) {
    // Queue<Integer> pq  = new PriorityQueue<Integer>();//ye present karta he min heap
	Queue<Integer> pq  = new PriorityQueue<Integer>(Comparator.reverseOrder());//ye present karta he max heap
     pq.offer(40);
     pq.offer(12);
     pq.offer(24);
     pq.offer(36);
     
     System.out.println(pq);
     pq.poll();//ye minimum node ko nikal dega min heap me aur max me max ko nikalega
     System.out.println(pq);
     
     System.out.println(pq.peek());//ye ye btayega ki kon sa agla element niklega
     
     
     

     
	}

}
