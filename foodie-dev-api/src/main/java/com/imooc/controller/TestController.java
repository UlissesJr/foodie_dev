package com.imooc.controller;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class TestController {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        Map<String,String> requestParams = new HashMap<>();
        long timestamp = System.currentTimeMillis();
        String appSecret = "123456";
        requestParams.put("appId","postman");
        requestParams.put("timestamp",String.valueOf(timestamp));
        requestParams.put("nonce","nonce");
        requestParams.put("appSecret",appSecret);
        String stringToSign = requestParams.values().stream().sorted(String::compareTo).collect(Collectors.joining("\n"));
        System.out.println(stringToSign);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(appSecret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes(StandardCharsets.UTF_8));
        String base64Sign =  new String(Base64.encodeBase64(signData),StandardCharsets.UTF_8);
        System.out.println("请求参数====================" + requestParams.toString());
        System.out.println("签名"+ URLEncoder.encode(base64Sign, StandardCharsets.UTF_8.name()));

    }
}
