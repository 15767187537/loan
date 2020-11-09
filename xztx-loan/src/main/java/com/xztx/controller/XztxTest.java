package com.xztx.controller;

import com.xztx.utils.TestUtils;

import java.util.HashMap;
import java.util.Map;

public class XztxTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key","value");
        map.put("key1","value1");
        Object key1 = map.get("C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\bin\\instrument.dll");
        Object key2 = map.get("file:///C:/Program%20Files/Java/jdk1.8.0_181/jre/lib/ext/jfxrt.jar");
        Object key3 = map.get("file:///C:/Program%20Files/Java/jdk1.8.0_181/jre/lib/ext/localedata.jar");
        Object key4 = map.get("file:///C:/Program%20Files/Java/jdk1.8.0_181/jre/lib/ext/nashorn.jar");
        System.out.println(key1);
        System.out.println(key2);
        System.out.println(key3);
        System.out.println(key4);
    }



}
