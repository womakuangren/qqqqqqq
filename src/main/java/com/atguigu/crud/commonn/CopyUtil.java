package com.atguigu.crud.commonn;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class CopyUtil {

//    public static Map<String, Object> copyToMap(HttpServletRequest request){
//        Map<String, Object> map = new HashMap<String, Object>();
//        Enumeration<String> enumeration = request.getParameterNames();
//        while (enumeration.hasMoreElements()) {
//            String name = (String) enumeration.nextElement();
//            Object value = null;
//            String[] arr = request.getParameterValues(name);
//            if(arr != null && arr.length == 1){
//                if(StringUtil.isNotBlank(arr[0])){
//                    value = arr[0];
//                }
//            }
//            if(arr != null && arr.length > 1){
//                value = arr;
//            }
//            if (value!=null) {
//                map.put(name, value);
//            }
//        }
//        return map;
//    }
}
