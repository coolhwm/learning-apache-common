package learning.apache.common.lang;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.*;

/**
 * Example: org.apache.commons.lang3.Validate
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ValidateUtilsTester {

    /**
     * Validate string/collection/map/array not empty
     */
    @Test
    public void isEmpty(){
        String string = "";
        List<String> list = new ArrayList<String>();
        Map<String, String> map = new HashMap<String, String>();
        String[] array = {};

        Validate.notEmpty(string, "string is empty, param=%s","12345");
        Validate.notEmpty(list, "list is empty");
        Validate.notEmpty(map, "map is empty");
        Validate.notEmpty(array, "array is empty");
    }

    /**
     * Validate object not null
     */
    @Test
    public void notNull(){
        Object object = null;
        Validate.notNull(object, "object is null, param=%s", "12345");
    }

    /**
     * Validate string not blank
     */
    @Test
    public void notBlank(){
        String string = "";
        Validate.notBlank(string, "string is blank, param=%s", "12345");
    }

    /**
     * Validate boolean expression is true
     */
    @Test
    public void isTrue(){
        boolean booleanExpression = 1 == 2;
        Validate.validState(booleanExpression, "state is not match");
        Validate.isTrue(booleanExpression, "boolean expression is not true");
    }

    /**
     * Validate that the specified primitive value falls between the two exclusive values specified
     */
    @Test
    public void between(){
        //validate int
        int value = 10;
        Validate.exclusiveBetween(1, 5, value,"the target value not between 1 and 5");
        //validate date
        Date now = new Date();
        Date yestaday = DateUtils.addDays(now, -1);
        Date tomorrow = DateUtils.addDays(now, 1);
        Validate.exclusiveBetween(now, tomorrow, yestaday,"the date value not between now and tomorrow");
    }


}
