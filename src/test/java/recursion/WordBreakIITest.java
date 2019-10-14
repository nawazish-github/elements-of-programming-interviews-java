package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WordBreakIITest {

    @Test
    public void wordBreakTest1(){
        WordBreakII wordBreakII = new WordBreakII();
        List<String> sentences =
                wordBreakII.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
        Assertions.assertArrayEquals(sentences.toArray(), new String[]{"cat sand dog", "cats and dog"});
    }

    @Test
    public void wordBreakTest2(){
        WordBreakII wordBreakII = new WordBreakII();
        List<String> sentences =
                wordBreakII.wordBreak("catsandog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
        Assertions.assertArrayEquals(sentences.toArray(), new String[]{});
    }

    @Test
    public void wordBreakTest3(){
        WordBreakII wordBreakII = new WordBreakII();
        List<String> sentences =
                wordBreakII.wordBreak("pineapplepenapple",
                        Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
        Assertions.assertArrayEquals(sentences.toArray(), new String[]{"pine apple pen apple", "pine applepen apple",
                "pineapple pen apple"});
    }

    @Test
    public void wordBreakTest4(){
        WordBreakII wordBreakII = new WordBreakII();
        List<String> sentences =
                wordBreakII.wordBreak("catsandog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
        Assertions.assertArrayEquals(sentences.toArray(), new String[]{});
    }

    /*@Test
    public void wordBreakTest5(){
        WordBreakII wordBreakII = new WordBreakII();
        List<String> sentences =
                wordBreakII.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                        "aaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                        Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa",
                                "aaaaaaaaaa"));
        System.out.println(sentences);
        //Assertions.assertArrayEquals(sentences.toArray(), new String[]{});
    }*/
}
