import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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


        };
    }

}

