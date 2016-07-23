package com.newland.apache.lang.tester;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Date;

/**
 * org.apache.commons.lang3.ObjectUtils
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ObjectUtilsTester {


    /**
     * defaultIfNull - Returns a default value if the object passed is null.
     */
    @Test
    public void defaultIfNull(){
        Date createDate = null;

        //use ObjectUtils.defaultIfNull
        createDate = ObjectUtils.defaultIfNull(createDate, new Date());

        //use if
        if(createDate != null){
            createDate = new Date();
        }

        //use operator
        createDate = createDate != null ? createDate : new Date();
    }

    /**
     * firstNonNull - Returns the first value in the array which is not null.
     */
    @Test
    public void firstNonNull(){
        Object[] objArr = {null, null, "not_null_str"};
        Object result = ObjectUtils.firstNonNull(objArr);
        System.out.println(result);
    }

}
