package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapController {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("a","aa");
        map.put("b","bb");
        ConcurrentHashMap.newKeySet();
        System.out.println(map.values());
    }
}
