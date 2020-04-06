package com.mengma.utils;

import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author fgm
 * @description  加密工具类
 * @date 2020-03-07
 ***/
public class MD5Utils {

    private static  final String SOLT="hello-spring-data";


    public static String toMD5(String str) {
        String src= StringUtils.isEmpty(str)?SOLT:SOLT+str;
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(src.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }

    public static void main(String[] args) {
        //5f6e126d9023384f5cde168fe59e215e
        System.out.println(toMD5("test_test"));
    }

}
