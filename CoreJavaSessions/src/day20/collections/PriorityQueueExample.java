package day20.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {
	public static void main(String args[]) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		// while adding element in Queue, it will always keep smallest element on the top
		queue.add(123);
		queue.add(245);
		queue.add(10);
		queue.add(105);
		queue.add(50);
		queue.add(1);
		System.out.println("Size: " + queue.size());
		System.out.println("Eleements of Queue: " + queue);
		 //element() returns top most element of the queue, if the queue if empty dn it
		 //will throw an exception by name 'NoSuchElementException'
		System.out.println("head element of the queue using element():" + queue.element());
		// peek() returns top most element of the queue, if the queue if empty dn it
		// will return 'null' instead of throwing exception
		System.out.println("head element of the queue using peek():" + queue.peek());
		System.out.println("iterating the queue elements using for-each loop:");
		for (Object obj : queue) {
			System.out.println(obj);
		}
		System.out.println("iterating the queue elements using Iterator:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Eleements of Queue: " + queue);
		// it will remove top most element of the Queue, if the queue is empty dn it
		// will throw an exception by name 'NoSuchElementException'
		System.out.println("removing element from Queue using remove(): " + queue.remove());// 10
		System.out.println("Eleements of Queue: " + queue);
		// it will remove top most element of the Queue, if the queue is empty dn it
		// will return 'null' value
		System.out.println("removing element from Queue using poll(): " + queue.poll());// 50
		System.out.println("Eleements of Queue: " + queue);
		System.out.println("after removing two elements:");
		Iterator itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("*********************");
		// using lamda expression
		queue.forEach(obj -> {
			System.out.println(obj);
		});
	}
}
