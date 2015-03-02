package dcll.kmag.mysimplestack;

import Interfaces.SimpleStack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleStack myStack=new MySimpleStack();
        Item item=new Item();

        System.out.println(" stack size at creation: "+myStack.getSize());

        myStack.push(item);
        System.out.println("stack size after 1 push: "+myStack.getSize());

        Item item1=myStack.peek();
        System.out.println("stack size after peek: "+myStack.getSize());

        Item item2=myStack.pop();
        System.out.println("stack size after 1 pop: "+myStack.getSize());



    }
}
