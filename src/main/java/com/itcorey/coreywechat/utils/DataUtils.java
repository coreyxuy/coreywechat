package com.itcorey.coreywechat.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author corey
 * @Description
 * @create 2019-12-30 17:40
 */
public class DataUtils {

    /**
     * @Description: long类型转换成日期
     *
     * @param lo 毫秒数
     * @return String yyyy-MM-dd HH:mm:ss
     */
    public static String longToDate(long lo){
        Date date = new Date(lo);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sd.format(date);
    }


    /**
     * @Description: String类型转成日期格式
     *
     * @param lo String类型日期好藐视
     * @return String yyyyMMdd
     */
    public static String getStrToDate(String lo){
        long time = Long.parseLong(lo);
        Date date = new Date(time);
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
        return sd.format(date);
    }
}
