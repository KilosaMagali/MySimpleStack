package dcll.kmag.mysimplestack;

import Interfaces.SimpleStack;
import junit.framework.TestCase;


import java.util.EmptyStackException;
import java.util.Stack;

public class MySimpleStackTest extends TestCase {

    //@Test
    public void testIsEmpty() throws Exception { //Test case
        // State of the world
        SimpleStack stack = new MySimpleStack();

        //Assertions
        assertTrue("A new stack should be empty", stack.isEmpty());
        assertEquals("A new stack has no element", 0, stack.getSize());
    }
   // @Test
    public void testGetSize() throws Exception {
        // State of the world
        SimpleStack stack1 = new MySimpleStack();
        SimpleStack stack2 = new MySimpleStack();
        Item item=new Item();

        //Code under test
        stack2.push(item);

        //Assertions
        assertEquals("An empty stack has no elements has no element", 0, stack1.getSize());
        assertEquals("The stack has one element", 1, stack2.getSize());
    }
    //@Test
    public void testPush() throws Exception {
       // Setup the "state of the world"
        SimpleStack myStack = new MySimpleStack();
        Item item = new Item();

        // Code under test
        myStack.push(item);

        // assertions
        assertFalse("The stack must not be empty", myStack.isEmpty());
        assertEquals("The stack contains 1 item", 1, myStack.getSize());

    }
    //@Test
    public void testPeek() throws Exception {
        // Setup the "state of the world"
        SimpleStack myStack1 = new MySimpleStack();
        SimpleStack myStack2 = new MySimpleStack();
        Item item = new Item();

        //code under test
        myStack2.push(item);

        //Assertions
        //assertEquals("Cant peek from empty Stack", Exception, myStack2.peek());
        assertSame("The pushed item is on top of the stack", item, myStack2.peek());

    }
    //@Test
    public void testPop() throws Exception {
        // Setup the "state of the world"
        SimpleStack myStack1 = new MySimpleStack();
        SimpleStack myStack2 = new MySimpleStack();
        Item item = new Item();


        //code under test
        myStack2.push(item);

        //assertions
        //assertEquals("Cant pop from empty Stack", Exception, myStack1.peek());
        assertSame("The just pushed item is the one to be popped", item, myStack2.pop());
        assertEquals("After pop, stack's size is reduces by 1", 0, myStack2.getSize());
    }

}