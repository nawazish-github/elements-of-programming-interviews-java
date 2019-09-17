package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstCharWithOneOccuranceTest {

    @Test
    public void testString(){
        FirstCharWithOneOccurance firstCharWithOneOccurance = new FirstCharWithOneOccurance();
        Character ch = firstCharWithOneOccurance.getFirstCharacter("baabrz");
        Assertions.assertEquals('r', ch);
    }
}
