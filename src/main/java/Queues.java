//        what is a Stack/ Queue, and how does it differ from an ArrayList?
//              Queue is a list which you can add to the end of and remove from the head of, you can also push something to the front if you want
//        how do we add to a Stack/Queue?
//              .add()
//        how do we remove from a Stack/Queue?
//              .poll()
//        what methods are available to us when we use one?
//              See below
//        is the indexing the same as ArrayList (i.e. first item we add is index 0, next is 1 etc)? If not, how/why is it different?
//              Yes
//        is it LIFO or FIFO? What does this mean?
//              First-in-First-out
//        See if you can come up with a real-world example or two! Maybe a diagram?
//              A Queue

import java.util.*;

public class Queues {

    public static void main(String[] args) {

    Deque<Integer> queue = new ArrayDeque<Integer>();

    for (int i =0; i<5; i++){
    queue.add(i);
    }


    System.out.println(queue);

    //poll will take the head of the queue i.e. the first item, return and remove it
    System.out.println(queue.poll());
    System.out.println(queue);

    //peek will return the head of the queue but not remove it
    System.out.println(queue.peek());
    System.out.println(queue);

    //push will add to the start of the list
    queue.push(5);
    System.out.println(queue);

    queue.addFirst(10); // insert in first position
    queue.addLast(20); // append in last position
    queue.push(30); // insert in first position, same as addFirst?
    queue.offer(40); // append in last position, same as addLast?

    System.out.println(queue);
    System.out.println(queue.pop()); // removes and returns first value

    }
}
