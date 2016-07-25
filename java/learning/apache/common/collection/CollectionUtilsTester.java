package learning.apache.common.collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Example: org.apache.commons.l
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class CollectionUtilsTester {

    /**
     * isEmpty/isNotEmpty
     */
    @Test
    public void isEmpty() {
        List<String> list = null;

        //double check
        if(list == null || list.size() == 0){
            System.out.println("double check: the list is empty");
        }

        //null safe
        if(CollectionUtils.isEmpty(list)){
            System.out.println("the list is empty");
        }

        //null unsafe
        if(list.isEmpty()){
            System.out.println("java.lang.NullPointerException");
        }
    }
    /**
     * get
     */
    @Test
    public void get() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("string", "test");
        map.put("int",1);

        Object value = null;
        value =  MapUtils.getString(map,"string");      //value="test"
        value =  MapUtils.getString(map, "int");        //value="1"
        value =  MapUtils.getInteger(map,"xx", 0);      //value=0
    }

}
