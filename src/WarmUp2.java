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
        if (i == -1) return false;
        if (i+1 >= str.length()) return false;
        String x = str.substring(i);
        return x.startsWith("xx");

    }

    //String Bits: Given a string, return a new string made of every other
    //char starting with the first, so "Hello" yields "Hlo".
    public static String stringBits(String str) {
        String result = "";
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i+1);
        }
        return result;
    }

    //StringSpolsion: Given a non-empty string like "Code" return a string like "CCoCodCode".
    public static String stringSplosion(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }

    //Given a string, return the count of the number of times that a substring length 2 appears
    //in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
    //(we won't count the end substring).
    public static int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length()-2);
        int count = 0;
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }

    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public static int arrayCount9(int[] nines) {
        int count = 0;
        for (int i=0; i<nines.length; i++) {
            if (nines[i] == 9) {
                count++;
            }
        }
        return count;
    }

    //arrayFront9
    //array123

    //String Match: Given 2 strings, a and b, return the number of the positions where they contain the same
    //length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
    //appear in the same place in both strings.
    public static int stringMatch(String a, String b){
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {
               count++;
            }
        }

        return count;
    }
    //String X: Given a string, return a version where all the "x" have been removed. Except an "x"
    //at the very start or end should not be removed.
    public static String stringX(String str){
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }
}

