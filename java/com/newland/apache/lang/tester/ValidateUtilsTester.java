package com.newland.apache.lang.tester;

import org.apache.commons.lang3.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ValidateUtilsTester {

    /**
     *
     */
    @Test
    public void isEmpty(){
        Object obj = null;
        Validate.notNull(obj, "The input value is null");
    }

}
