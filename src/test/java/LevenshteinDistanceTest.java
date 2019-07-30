import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import string.LevenshteinDistance;

public class LevenshteinDistanceTest {

    @Test
    public void levenshteinDistanceTest(){
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        int distance = levenshteinDistance.levenshteinDistance("benyam", "ephrem");
        Assertions.assertEquals(5, distance);

        distance = levenshteinDistance.levenshteinDistance("khan", "khak");
        Assertions.assertEquals(1, distance);
    }
}
