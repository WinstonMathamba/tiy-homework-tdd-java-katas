/**
 * Kata TDD assingment for WarmUp 2 on codingbat by win808mac on 8/26/16.
 */

public class WarmUp2 {


    //Given a string and a non-negative int n, return a larger string that is
    //n copies of the original string.
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }
}