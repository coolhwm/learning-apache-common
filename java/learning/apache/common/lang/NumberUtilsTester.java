package learning.apache.common.lang;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Example: org.apache.commons.lang3.NumberUtils
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class NumberUtilsTester {

    /**
     * isNumber/Digits/Parsabel 
     */
    @Test
    public void is(){
        if(NumberUtils.isDigits("11")){
            System.out.println("str contains only digit characters.");
        }

        if(NumberUtils.isNumber("11.1")){
            System.out.println("str is a valid Java number.");
        }

        if(NumberUtils.isParsable("11.1")){
            System.out.println("str is a parsable number");
        }
    }

    /**
     * toInt/Float/Long/Short 
     */
    @Test
    public void to(){
        Integer num = null;

        //prase exception
        try{
            num = Integer.parseInt("xxx");
        }
        catch (NumberFormatException e){
            num = 0;
        }

        // Convert a String to an int, returning zero if the conversion fails.
        num = NumberUtils.toInt("10");      //num = 10
        num = NumberUtils.toInt("xxx");     //num = 0
        num = NumberUtils.toInt("xxx", 1);  //num = 1


    }

}
