import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.OBJ_ADAPTER;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by win808mac on 8/26/16.
 */
@RunWith(JUnitParamsRunner.class)
public class WarmUp2Test {

    @Test
    @Parameters
    /*Given a string and an int (n)
     return a larger string that is n copies of the original string.*/

    public void stringTimesTest1(String word, int n, String expresult){
        //Arrange

        //Act
        String test = WarmUp2.stringTimes(word,n);

        //Assert
        assertThat(test, equalTo(expresult));

    }
    private Object[] parametersForStringTimesTest1(){
        return new Object[]{
                new Object[]{"Hi",2,"HiHi"},
                new Object[]{"Hi",3,"HiHiHi"},
                new Object[]{"Hi",1,"Hi"},
                new Object[]{"Hi",5,"HiHiHiHiHi"},
                new Object[]{"Hi",0,""},
                new Object[]{"Oh Boy!",2,"Oh Boy!Oh Boy!"},
                new Object[]{"x",4,"xxxx"},
                new Object[]{"",4,""},
                new Object[]{"code",2,"codecode"},
                new Object[]{"code",3,"codecodecode"}
        };
    }
    @Test
    @Parameters
    /*Count XX: Count the number of "xx" in the given string. We'll say that
    //overlapping is allowed, so "xxx" contains 2 "xx".*/
    public void countXXTest(String str, int expresult){
        //arrange

        //act
        int test = WarmUp2.countXX(str);

        //assert
        assertThat(test,equalTo(expresult));
    }
    private Object[] parametersForCountXXTest(){
        return new Object[]{
                new Object[]{"abcxx",1},
                new Object[]{"xxx",2},
                new Object[]{"xxxx",3},
                new Object[]{"abc",0},
                new Object[]{"Hello there",0},
                new Object[]{"Hexxo thexxe",2},
                new Object[]{"",0},
                new Object[]{"Kittens",0},
                new Object[]{"Kittensxxx",2},

        };
    }
    @Test
    @Parameters
    //DoubleX: Given a string, return true if the first instance of "x" in the
    //string is immediately followed by another "x".
    public void doubleXTest(String str, boolean expresult){
        //arrange

        //act
        boolean test = WarmUp2.doubleX(str);

        //assert
        assertThat(test,equalTo(expresult));
    }
    private Object[] parametersForDoubleXTest(){
        return new Object[]{
                new Object[]{"axxbb",true},
                new Object[]{"axaxax",false},
                new Object[]{"xxxxx",true},
                new Object[]{"xaxxx",false},
                new Object[]{"aaaax",false},
                new Object[]{"",false},
                new Object[]{"abc",false},
                new Object[]{"x",false},
                new Object[]{"xx",true},
                new Object[]{"xax",false},
                new Object[]{"xaxx",false},
        };
    }

    @Test
    @Parameters
    //String Bits: Given a string, return a new string made of every other
    //char starting with the first, so "Hello" yields "Hlo".
    public void stringBitsTest(String str, String expresult){
        //arrange

        //act
        String test = WarmUp2.stringBits(str);

        //assert
        assertThat(test, equalTo(expresult));
    }
    private Object[] parametersForStringBitsTest(){
        return new Object[]{
                new Object[]{"Hello","Hlo"},
                new Object[]{"Hi","H"},
                new Object[]{"Heeololeo","Hello"},
                new Object[]{"HiHiHi","HHH"},
                new Object[]{"",""},
                new Object[]{"Greetings","Getns"},
                new Object[]{"Chocoate","Coot"},
                new Object[]{"pi","p"},
                new Object[]{"Hello Kitten","HloKte"},
                new Object[]{"hxaxpxpxy","happy"},
        };
    }
    @Test
    @Parameters
    //StringSpolsion: Given a non-empty string like "Code" return a string like "CCoCodCode".
    public void stringSplosionTest(String str, String expresult){
        //arrange

        //act
        String test = WarmUp2.stringSplosion(str);

        //assert
        assertThat(test, equalTo(expresult));
    }
    private Object[] parametersForStringSplosionTest(){
        return new Object[]{
                new Object[]{"Code","CCoCodCode"},
                new Object[]{"abc","aababc"},
                new Object[]{"ab","aab"},
                new Object[]{"x","x"},
                new Object[]{"fade","ffafadfade"},
                new Object[]{"There","TThTheTherThere"},
                new Object[]{"Kitten","KKiKitKittKitteKitten"},
                new Object[]{"Bye","BByBye"},
                new Object[]{"Good","GGoGooGood"},
                new Object[]{"Bad","BBaBad"},
        };
    }
    @Test
    @Parameters
    //Given a string, return the count of the number of times that a substring length 2 appears
    //in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
    //(we won't count the end substring).
    public void last2Test(String str, int expresult){
        //arrange

        //act
        int test = WarmUp2.last2(str);

        //assert
        assertThat(test, equalTo(expresult));
    }
    private Object[] parametersForLast2Test(){
        return new Object[]{
                new Object[]{"hixxxhi",1},
                new Object[]{"xaxxaxaxx",1},
                new Object[]{"xxaxxaxxaxx",3},
                new Object[]{"xaxaxaxx",0},
                new Object[]{"xxxx",2},
                new Object[]{"13121312",1},
                new Object[]{"11212",1},
                new Object[]{"13121312",1},
                new Object[]{"1717171",2},
                new Object[]{"hi",0},
                new Object[]{"h",0},
                new Object[]{"",0},
        };
    }

    @Test
    @Parameters
    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public void arrayCount9Test(int[] nines, int expresult){
        //arrange

        //act
        int test = WarmUp2.arrayCount9(nines);

        //assert
        assertThat(test, equalTo(expresult));
    }
    private Object[] parametersForArrayCount9(){
        return new Object[]{
                new Object[]{,1},
        };
    }
}

