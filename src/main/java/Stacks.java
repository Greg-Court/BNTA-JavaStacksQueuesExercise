// what is a Stack/ Queue, and how does it differ from an ArrayList?
//      A Java Stack is a data structure that implements the Last-In-First-Out (LIFO) principle, meaning that the last
//      element that was added to the stack is the first one to be removed.
//      It is used to store elements in a linear manner and can be implemented using the java.util.Stack class in Java

// how do we add to a Stack/Queue?
//      .push()



// how do we remove from a Stack/Queue?
//      .pop()



// what methods are available to us when we use one?
//      see below



// is the indexing the same as ArrayList (i.e. first item we add is index 0, next is 1 etc)? If not, how/why is it different?
//      Yes same


// is it LIFO or FIFO? What does this mean?
//      LIFO



// See if you can come up with a real-world example or two! Maybe a diagram?
//      Stack of dishes


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
public class Stacks {

    // implements Last-In-First-Out mechanism

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        // STACK IMPLEMENTATION OF STACK????? ---------------------------------------------

        // adding elements to the stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // methods unique to Stacks

        System.out.println("Last element: " + stack.peek());

        System.out.println("3 is at position: " + stack.search(3));

        System.out.println("Popped element: " + stack.pop());

        // methods from List implementation

        System.out.println("Element at index 2: " + stack.get(2));

        System.out.println("Element at index 2: " + stack.set(2,1000));

        //  to print out the entire stack

        System.out.println(stack);

        System.out.println(stack.size());


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        

        // DEQUEUE IMPLEMENTATION OF STACK ---------------------------------------------

        Deque<Integer> dequeueStack = new ArrayDeque<>();

        // adding elements to the stack

        dequeueStack.push(1);
        dequeueStack.push(2);
        dequeueStack.push(3);
        dequeueStack.push(4);
        dequeueStack.push(5);

        // methods unique to Stacks

        System.out.println("Last element: " + dequeueStack.peek());

        // NOT WORKING
        // System.out.println("3 is at position: " + dequeueStack.search(3));

        System.out.println("Popped element: " + dequeueStack.pop());

        // methods from List implementation

        // NOT WORKING
        // System.out.println("Element at index 2: " + dequeueStack.get(2));

        // NOT WORKING
        // System.out.println("Element at index 2: " + dequeueStack.set(2,1000));


        //  to print out the entire stack
        System.out.println(dequeueStack);

        // to get size
        System.out.println(dequeueStack.size());



    }


}
