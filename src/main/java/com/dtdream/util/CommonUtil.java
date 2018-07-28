package com.dtdream.util;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;
import java.util.UUID;

/**
 * 常用工具类
 */
public class CommonUtil {
    /**
     * UUID的生成
     * @return
     */
    public static String createUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
    /**
     * json转化map
     * @param params
     * @return map
     */
    public static Map JsonToMap(String params){
        //fastjson引用阿里的把json转化成map
        Map<String, Object> itemMap = JSONObject.parseObject(params);
        return itemMap;
    }



}
