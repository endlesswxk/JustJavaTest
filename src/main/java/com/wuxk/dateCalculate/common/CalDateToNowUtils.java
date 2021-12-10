package com.wuxk.dateCalculate.common;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 计算期待日期差值
 */
public class CalDateToNowUtils {

    /**
     * 计算指定日期离今天的所剩时间
     *
     * @param targetDateTime 指定日期
     * @param pattern 格式转换
     * @return 所剩时间
     */
    private static String calDateToNowUtils(String targetDateTime, String pattern) {

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat();


        return StringUtils.EMPTY;
    }

}
