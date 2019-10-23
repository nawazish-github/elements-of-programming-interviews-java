package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinCharsToPalindromTest {

    @Test
    public void test1(){
        MinCharsToPalindrom minCharsToPalindrom = new MinCharsToPalindrom();
        int actual = minCharsToPalindrom.minCharsToPalindrom("");
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void test2(){
        MinCharsToPalindrom minCharsToPalindrom = new MinCharsToPalindrom();
        int actual = minCharsToPalindrom.minCharsToPalindrom("aba");
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void test3(){
        MinCharsToPalindrom minCharsToPalindrom = new MinCharsToPalindrom();
        int actual = minCharsToPalindrom.minCharsToPalindrom("abcd");
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void test4(){
        MinCharsToPalindrom minCharsToPalindrom = new MinCharsToPalindrom();
        int actual = minCharsToPalindrom.minCharsToPalindrom("ab");
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test5(){
        MinCharsToPalindrom minCharsToPalindrom = new MinCharsToPalindrom();
        int actual = minCharsToPalindrom.minCharsToPalindrom("a");
        Assertions.assertEquals(0, actual);
    }


    @Test
    public void test6(){
        MinCharsToPalindrom minCharsToPalindrom = new MinCharsToPalindrom();
        int actual = minCharsToPalindrom.minCharsToPalindrom("aacecaaaa");
        Assertions.assertEquals(2, actual);
    }



    @Test
    public void test7(){
        MinCharsToPalindrom minCharsToPalindrom = new MinCharsToPalindrom();
        int actual = minCharsToPalindrom.minCharsToPalindrom("hqghumeaylnlfdxfi");
        Assertions.assertEquals(16, actual);
    }
}
