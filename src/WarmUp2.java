/**
 * Kata TDD assingment for WarmUp 2 on codingbat by win808mac on 8/26/16.
 */

public class WarmUp2 {


    //String Times: Given a string and a non-negative int n, return a larger string that is
    //n copies of the original string.
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    //Count XX: Count the number of "xx" in the given string. We'll say that
    //overlapping is allowed, so "xxx" contains 2 "xx".
    public static int countXX(String str){
       int count = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")) count++;
        }return count;

    }

    //DoubleX: Given a string, return true if the first instance of "x" in the
    //string is immediately followed by another "x".
    public static boolean doubleX(String str){
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x"
//
//        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
//        return str.substring(i+1, i+2).equals("x");
//
//        // Another approach -- .startsWith() simplifies the logic
        String x = str.substring(i);
        return x.startsWith("xx");

    }
}