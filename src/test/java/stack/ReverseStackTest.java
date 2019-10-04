package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ReverseStackTest {

    @Test
    public void reverseStackTest(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        ReverseStackRecursively reverseStackRecursively = new ReverseStackRecursively();
        ArrayList<Integer> reverseStack = reverseStackRecursively.reverseStack(input);
        Assertions.assertArrayEquals(input.toArray(), reverseStack.toArray());
    }

    @Test
    public void reverseStackTest2(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);

        ReverseStackRecursively reverseStackRecursively = new ReverseStackRecursively();
        ArrayList<Integer> reverseStack = reverseStackRecursively.reverseStack(input);
        Assertions.assertArrayEquals(input.toArray(), reverseStack.toArray());
    }
}
