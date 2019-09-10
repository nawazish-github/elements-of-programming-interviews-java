package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBracketProblemTest {
    @Test
    public void balancedBracket(){
        BalancedBracketProblem balancedBracketProblem = new BalancedBracketProblem();
        boolean actual = balancedBracketProblem.balancedBrackets("([])(){}(())()()");
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void balancedBracket2(){
        BalancedBracketProblem balancedBracketProblem = new BalancedBracketProblem();
        boolean actual = balancedBracketProblem.balancedBrackets("([{)]}");
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void balancedBracket3(){
        BalancedBracketProblem balancedBracketProblem = new BalancedBracketProblem();
        boolean actual = balancedBracketProblem.balancedBrackets("()[]{}{");
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void balancedBracket4(){
        BalancedBracketProblem balancedBracketProblem = new BalancedBracketProblem();
        boolean actual = balancedBracketProblem.balancedBrackets(")[]}");
        Assertions.assertEquals(false, actual);
    }
}
