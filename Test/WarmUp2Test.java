import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.OBJ_ADAPTER;
import org.omg.CORBA.ORBPackage.InconsistentTypeCode;

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
    //String Match: Given 2 strings, a and b, return the number of the positions where they contain the same
    //length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
    //appear in the same place in both strings.
    public void stringMatchTest(String a, String b, int expresult){
        //arrange

        //act
        int test = WarmUp2.stringMatch(a,b);

        //assert
        assertThat(test,equalTo(expresult));
    }
    private Object[] parametersForStringMatchTest(){
        return new Object[]{
                new Object[]{"xxcaazz","xxbaaz",3},
                new Object[]{"abc","abc",2},
                new Object[]{"abc","axc",0},
                new Object[]{"hello","he",1},
                new Object[]{"he","hello",1},
                new Object[]{"h","hello",0},
                new Object[]{"","hello",0},
                new Object[]{"aabbccdd","abbbxxd",1},
                new Object[]{"aaxxaaxx","iaxxai",3},
                new Object[]{"iaxxai","aaxxaaxx",3},
        };
    }

    @Test
    @Parameters
    //String X: Given a string, return a version where all the "x" have been removed. Except an "x"
    //at the very start or end should not be removed.
    public void stringXTest(String str,String expresult){
        //act

        //arrange
        String test = WarmUp2.stringX(str);

        //assert
        assertThat(test,equalTo(expresult));
    }
    private Object[] parametersForStringXTest(){
        return new Object[]{
                new Object[]{"xxHxix","xHix"},
                new Object[]{"abxxxcd","abcd"},
                new Object[]{"xabxxxcdx","xabcdx"},
                new Object[]{"xKittenx","xKittenx"},
                new Object[]{"Hello","Hello"},
                new Object[]{"xx","xx"},
                new Object[]{"x","x"},
                new Object[]{"",""},
        };
    }

    @Test
    @Parameters
    //Alt Pairs: Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
    //so "kittens" yields "kien".
    public void altPairsTest(String str, String expresult){
        //act

        //arrange
        String test = WarmUp2.altPairs(str);

        //assert
        assertThat(test,equalTo(expresult));
    }
    private Object[] parametersForAltPairsTest(){
        return new Object[]{
                new Object[]{"kitten","kien"},
                new Object[]{"Chocolate","Chole"},
                new Object[]{"CodingHorror","Congrr"},
                new Object[]{"yak","ya"},
                new Object[]{"ya","ya"},
                new Object[]{"y","y"},
                new Object[]{"",""},
                new Object[]{"ThisThatTheOther","ThThThth"},
        };
    }

    @Test
    @Parameters
    //String Yak: Suppose the string "yak" is unlucky. Given a string, return a version where
    //all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
    public void stringYakTest(String str, String expresult) {
        //act

        //arrange
        String test = WarmUp2.stringYak(str);

        //assert
        assertThat(test,equalTo(expresult));
    }
    private Object[] parametersForStringYakTest(){
        return new Object[]{
                new Object[]{"yakpak","pak"},
                new Object[]{"pakyak","pak"},
                new Object[]{"yak123ya","123ya"},
                new Object[]{"yak",""},
                new Object[]{"yakxxxyak","xxx"},
                new Object[]{"HiyakHi","HiHi"},
                new Object[]{"xxxyakyyyakzzz","xxxyyzzz"},
        };
    }
    @Test
    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public void arrayCount9Test(){
        //act
        int[] nines = {1,2,9};

        //arrange
        Integer test = WarmUp2.arrayCount9(nines);

        //assert
        assertThat(test,equalTo(1));
    }
    @Test
    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public void arrayCount9Test1(){
        //act
        int[] nines = {1,9,9};

        //arrange
        Integer test = WarmUp2.arrayCount9(nines);

        //assert
        assertThat(test,equalTo(2));

    }
    @Test
    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public void arrayCount9Test2(){
        //act
        int[] nines = {1,9,9,3,9};

        //arrange
        Integer test = WarmUp2.arrayCount9(nines);

        //assert
        assertThat(test,equalTo(3));

    }
    @Test
    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public void arrayCount9Test3(){
        //act
        int[] nines = {1,2,3};

        //arrange
        Integer test = WarmUp2.arrayCount9(nines);

        //assert
        assertThat(test,equalTo(0));
    }
    @Test
    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public void arrayCount9Test4(){
        //act
        int[] nines = {};

        //arrange
        Integer test = WarmUp2.arrayCount9(nines);

        //assert
        assertThat(test,equalTo(0));
    }
    @Test
    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public void arrayCount9Test5(){
        //act
        int[] nines = {4,2,4,3,1};

        //arrange
        Integer test = WarmUp2.arrayCount9(nines);

        //assert
        assertThat(test,equalTo(0));
    }
    @Test
    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public void arrayCount9Test6(){
        //act
        int[] nines = {9,2,4,3,1};

        //arrange
        Integer test = WarmUp2.arrayCount9(nines);

        //assert
        assertThat(test,equalTo(1));
    }

    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test(){
        //arrange
        int[] num = {1,2,9,3,4};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test1(){
        //arrange
        int[] num = {1,2,3,4,9};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test2(){
        //arrange
        int[] num = {1,2,3,4,5};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test3(){
        //arrange
        int[] num = {9,2,3};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test4(){
        //arrange
        int[] num = {1,9,9};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test5(){
        //arrange
        int[] num = {1,2,3};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test6(){
        //arrange
        int[] num = {1,9};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test7(){
        //arrange
        int[] num = {5,5};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test8(){
        //arrange
        int[] num = {2};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test9(){
        //arrange
        int[] num = {9};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test10(){
        //arrange
        int[] num = {};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public void arrayFront9Test11(){
        //arrange
        int[] num = {3,9,2,3,3};

        //act
        boolean test = WarmUp2.arrayFront9(num);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test(){
        //arrange
        int[] nums = {1,1,2,3,1};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test1(){
        //arrange
        int[] nums = {1,1,2,4,1};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test2(){
        //arrange
        int[] nums = {1,2,1,2,3};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test3(){
        //arrange
        int[] nums = {1,1,2,1,2,1};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test4(){
        //arrange
        int[] nums = {1,2,3,1,2,3};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test5(){
        //arrange
        int[] nums = {1,2,3};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test6(){
        //arrange
        int[] nums = {1,1,1};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test7(){
        //arrange
        int[] nums = {1,2};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public void array123Test8(){
        //arrange
        int[] nums = {};

        //act
        boolean test = WarmUp2.array123(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test(){
        //arrange
        int[] nums = {6,6,2};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(1));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test1(){
        //arrange
        int[] nums = {6,6,2,6};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(1));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test2(){
        //arrange
        int[] nums = {6,7,2,6};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(1));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test3(){
        //arrange
        int[] nums = {6,6,2,6,7};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(2));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test4(){
        //arrange
        int[] nums = {1,6,3};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(0));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test5(){
        //arrange
        int[] nums = {6,1};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(0));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test6(){
        //arrange
        int[] nums = {};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(0));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test7(){
        //arrange
        int[] nums = {3,6,7,6};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(1));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test8(){
        //arrange
        int[] nums = {3,6,6,7};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(2));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test9(){
        //arrange
        int[] nums = {6,3,6,6};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(1));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test10(){
        //arrange
        int[] nums = {6,7,6,6};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(2));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test11(){
        //arrange
        int[] nums = {1,2,3,5,6};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(0));
    }
    @Test
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public void array667Test12(){
        //arrange
        int[] nums = {1,2,3,6,6};

        //act
        Integer test = WarmUp2.array667(nums);

        //assert
        assertThat(test,equalTo(1));
    }

    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest(){
        //arrange
        int[] nums = {1,1,2,2,1};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest1(){
        //arrange
        int[] nums = {1,1,2,2,2,1};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest2(){
        //arrange
        int[] nums = {1,1,1,2,2,2,1};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest3(){
        //arrange
        int[] nums = {1,1,2,2,1,2};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest4(){
        //arrange
        int[] nums = {1,2,1};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest5(){
        //arrange
        int[] nums = {1,1,1};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(false));
    }
    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest6(){
        //arrange
        int[] nums = {1,1,};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest7(){
        //arrange
        int[] nums = {1};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public void noTriplesTest8(){
        //arrange
        int[] nums = {};

        //act
        boolean test = WarmUp2.noTriples(nums);

        //assert
        assertThat(test, equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test(){
        //arrange
        int[] nums = {1,2,7,1};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test1(){
        //arrange
        int[] nums = {1,2,8,1};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test2(){
        //arrange
        int[] nums = {2,7,1};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test3(){
        //arrange
        int[] nums = {3,8,2};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test4(){
        //arrange
        int[] nums = {2,7,3};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test5(){
        //arrange
        int[] nums = {2,7,4};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test6(){
        //arrange
        int[] nums = {2,7,-1};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test7(){
        //arrange
        int[] nums = {2,7,-2};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test8(){
        //arrange
        int[] nums = {4,5,3,8,0};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test9(){
        //arrange
        int[] nums = {2,7,5,10,4};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test10(){
        //arrange
        int[] nums = {2,7,-2,4,9,3};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(true));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test11(){
        //arrange
        int[] nums = {2,7,5,10,1};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(false));
    }
    @Test
    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public void has271Test12(){
        //arrange
        int[] nums = {2,7,-2,4,10,2};

        //act
        boolean test = WarmUp2.has271(nums);

        //assert
        assertThat(test,equalTo(false));
    }
}

