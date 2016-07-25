package learning.apache.common.lang;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Example: org.apache.commons.lang3.DateUtils
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class DateUtilsTester {
    /**
     * parseDate - Parses a string representing a date by trying a variety of different parsers
     */
    @Test
    public void parseDate() {
        Date date = null;
        try {
            String[] patterns = { "yyyy-MM-dd HH:mm:ss",  "yyyy/MM/dd HH:mm:ss"};
            date = DateUtils.parseDate("2015/05/20 10:23:12", patterns);  //OK
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * addDays/Hours/Months/Secondes/Weeks/Years
     */
    @Test
    public void add() {
        Date date = new Date();
        //add a day use Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.HOUR_OF_DAY, -1);
        c.add(Calendar.MONTH, 1);

        //add a day use DateUtils
        date = DateUtils.addDays(date,1);
        date = DateUtils.addHours(date,-1);
        date = DateUtils.addMonths(date,1);
    }

    /**
     * round/ceiling/truncate
     */
    @Test
    public void round() {
        Date now = new Date();
        Date today = DateUtils.truncate(now, Calendar.DAY_OF_MONTH);
        Date tomorrow  = DateUtils.ceiling(now, Calendar.DAY_OF_MONTH);
        Date round = DateUtils.ceiling(now, Calendar.DAY_OF_MONTH);
    }
}