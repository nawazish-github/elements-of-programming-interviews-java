package recursion.divideandconquer;

import org.junit.jupiter.api.Test;
import recursion.divideandconnquer.ParenthesizeExpression;

import java.util.List;

public class ParenthesizeExpressionTest {

    @Test
    public void test(){
        ParenthesizeExpression parenthesizeExpression = new ParenthesizeExpression();
        List<String> abc = parenthesizeExpression.parenthesize("abcd");
        System.out.println(abc);
    }
}
