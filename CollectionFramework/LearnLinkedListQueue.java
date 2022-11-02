/* difference between offer vs add function add ka mtlb hota he ki agar elementsuccessfully add ho ajyege to true aayga barna exception
 offer ka mtlb hota he ki agar succesfully add hota to true barna false aayega error nhi aayega.
 */
/* difference btwenn remove vs pop remove elemt me agar list empty he to error aayega but pop me null aayega.*/

import java.util.*;
public class LearnLinkedListQueue {

	public static void main(String[] args) {
  // Queue present in FIFO condition
	
		Queue<Integer> queue  = new LinkedList<Integer>();//besicaly linked list implement karta he Queue ko
		queue.offer(12);// offere add karta he element ko
		queue.offer(24);
		queue.offer(36);
		
		System.out.println(queue);// [12,24,36]
		queue.poll();// poll delete karta he 
		System.out.println(queue);//[24,36]
		System.out.println(queue.peek());//ye ye batata he ki agla kon sa element nikalne bala he 
		
	}

}
