package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SearchInSortedMatrixTest {

    int[][] matrix = {
        {1,4,7,12,15, 1000},
        {2, 5, 19, 31, 32, 1001},
        {3,8,24, 33, 35, 1002},
        {40, 41, 42, 44, 45, 1003},
        {99, 100, 103, 106, 128, 1004}
    };

    @Test
    public void searchInSortedMatrixTest(){
        SearchInASortedMatrix searchInASortedMatrix = new SearchInASortedMatrix();
        int[] position = searchInASortedMatrix.searchInASortedMatric(matrix, 44);
        Assertions.assertArrayEquals(new int[]{3,3}, position);
    }
}
