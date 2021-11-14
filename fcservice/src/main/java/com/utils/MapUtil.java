package com.utils;

import com.message.ErrorCodeAndMessage;
import com.message.GlobalException;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * POJO对象转成Map
 */
@Component
public class MapUtil {

    /**
     * POJO对象转换成HashMap
     */
    public <T> Map<String,Object> objectToMap(T t,String ... ignoreFields){
        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        Field [] declaredFields = t.getClass().getDeclaredFields();
        List<String> ignoreFieldsList = Arrays.asList(ignoreFields);
        Arrays.stream(declaredFields).forEach(data ->{
            data.setAccessible(true);
            try{
                if (ignoreFieldsList.isEmpty() || !ignoreFieldsList.contains(data.getName())){
                    hashMap.put(data.getName(),data.get(t));
                }
            }catch (Exception exception){
                throw new GlobalException(ErrorCodeAndMessage.ERROR_UNKNOWN);
            }
        });
        return hashMap;
    }
}
