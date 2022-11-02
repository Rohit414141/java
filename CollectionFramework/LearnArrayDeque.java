import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
  ArrayDeque<Integer> ad  = new ArrayDeque<Integer>();/* esme first and last me elemtn add kar sakte he */
      ad.offer(23);
      ad.offerFirst(12);
      ad.offerLast(45);
      ad.offer(40);
       System.out.println(ad);
       
       System.out.println(ad.peek());
       System.out.println(ad.peekFirst());
       System.out.println(ad.peekLast());
       
       System.out.println(ad.poll());
       System.out.println(ad);
       System.out.println(ad.pollFirst());
       System.out.println(ad);
       System.out.println(ad.pollLast());
       System.out.println(ad);
	} 

}
