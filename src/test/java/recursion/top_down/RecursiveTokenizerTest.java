package recursion.top_down;

import org.junit.jupiter.api.Test;

public class RecursiveTokenizerTest {

    @Test
    public void test(){
        RecursiveTokenizer recursiveTokenizer = new RecursiveTokenizer();
        recursiveTokenizer.recursiveTokenizer("understandinng computer science");
    }
}
