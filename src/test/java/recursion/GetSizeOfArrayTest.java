package recursion;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetSizeOfArrayTest {

    @Test
    public void getSizeOfArrayTest(){
        GetSizeOfArray getSizeOfArray = new GetSizeOfArray();
        int[] array = new int[9];
        int actual = getSizeOfArray.getSizeOfArray(array, 0);
        Assertions.assertEquals(9, actual);
    }
}
