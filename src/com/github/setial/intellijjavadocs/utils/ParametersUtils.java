package com.github.setial.intellijjavadocs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ZyL on 2016/11/9.
 *
 * @author ZyL
 */
public class ParametersUtils {

    public  static String getDate() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        return df.format(new Date());
    }

    public static String getDateTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return df.format(new Date());
    }

    public static String getUser() {
        Properties properties = System.getProperties();
        return properties.getProperty("user.name");
    }

    public static void setParameters(Map params) {
        params.put("date", getDate());
        params.put("datetime", getDateTime());
        params.put("user", getUser());
    }
}
