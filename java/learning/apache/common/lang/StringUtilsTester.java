package learning.apache.common.lang;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Example: org.apache.commons.lang3.StringUtils
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class StringUtilsTester {

    /**
     * IsEmpty/IsBlank - checks if a String contains text
     */
    @Test
    public void isEmpty(){
        String str = null;

        //double check
        if(str == null || str.length() == 0){
            System.out.println("double check: text is empty");
        }

        //null safe
        if(StringUtils.isEmpty(str)){
            System.out.println("StringUtils: text is empty");
        }

        //null safe
        if(StringUtils.isBlank(" ")){
            System.out.println("StringUtils: text is blank");
        }

         //null unsafe
        if(str.isEmpty()){
            System.out.println("java.lang.NullPointerException");
        }


    }

    /**
     * Equals/Compare - compares two strings null-safe
     */
    @Test
    public void equals() {
        String lhs = null;
        String rhs = "test_string";

        //double check
        if( (lhs != null && lhs.equals(rhs))){
            System.out.println("double check: str is equals");
        }

        //null safe
        if(StringUtils.equals(lhs, rhs)){
            System.out.println("StringUtils: str is equals");
        }

        //null unsafe
        if(lhs.equals(rhs)){
            System.out.println("java.lang.NullPointerException");
        }
    }

    /**
     * IndexOf/LastIndexOf/Contains - null-safe index-of checks
     */
    @Test
    public void contains() {
        String searchChar = null;
        String text = null;

        //double check
        if(text != null && searchChar != null && text.contains(searchChar)){
            System.out.println("double check: text is contains searchChar");
        }

        //null safe
        if(StringUtils.contains(text,searchChar)){
            System.out.println("StringUtils: text is contains searchChar");
        }

        //null unsafe
        if(text.equals(searchChar)){
            System.out.println("java.lang.NullPointerException");
        }
    }

    /**
     * Split/Join - splits a String into an array of substrings and vice versa
     */
    @Test
    public void join(){
        //join string array
        String[] strArr = {"a","b","c","d"};
        System.out.println(StringUtils.join(strArr,"|"));

        //join string list
        List<String> strList = Arrays.asList(strArr);
        System.out.println(StringUtils.join(strList,"|"));

        //null safe split
        String str = null;
        System.out.println(StringUtils.split(str,","));

        //null unsafe split
        System.out.println(str.split(","));
    }
}
