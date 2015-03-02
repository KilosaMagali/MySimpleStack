package dcll.kmag.mysimplestack;

import Interfaces.SimpleStack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by kilosakeyrocker on 28/02/15.
 */
public class MySimpleStack implements SimpleStack {
    private Stack<Item> pile;
    public MySimpleStack(){
        pile=new Stack();
    }

    @Override
    public boolean isEmpty() {
         return pile.isEmpty();
    }

    @Override
    public int getSize() {
        return pile.size();
    }

    @Override
    public void push(Item item) {
            pile.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        Item a= pile.peek();
        return a;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return pile.pop();
    }
}
