package com.imooc.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.util.Date;

/**
 * Created by LuoboGan
 * Date:2020/12/18
 */
public class MD5Utils {

    public static String getMD5Str(String strValue) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return Base64.encodeBase64String(md5.digest(strValue.getBytes()));
    }

    public static void main(String[] args) {
        try {
            String md5 = getMD5Str("imooc");
            System.out.println(md5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(new Date());
    }
}
