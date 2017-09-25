package com.finsage.util.XMLUtil;

/**
 * Created by knigh on 2017/9/22.
 */
public class StringUtil {

    public static boolean isBlank(String parameter){
        if (parameter == null)
            return true;
        else {
            if (parameter.equals(""))
                return true;
            else
                return false;
        }
    }
    
    public static boolean isBlank(Integer parameter){
        if (parameter == null)
            return true;
        else {
            if (parameter.equals(0))
                return true;
            else
                return false;
        }
    }
}
