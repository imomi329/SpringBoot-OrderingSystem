package com.finsage.web.base;

/**
 * Created by knigh on 2017/9/21.
 */
public class Message {

    public final static String returnCode0000 = "0000";

    public final static String returnMessage0000 = "success";

    public final static String returnCode1000 = "1000";

    public final static String returnMessage1000 = "帳號密碼錯誤";


    public static String getReturnCode0000() {
        return returnCode0000;
    }

    public static String getReturnMessage0000() {
        return returnMessage0000;
    }

    public static String getReturnCode1000() {
        return returnCode1000;
    }

    public static String getReturnMessage1000() {
        return returnMessage1000;
    }

}
