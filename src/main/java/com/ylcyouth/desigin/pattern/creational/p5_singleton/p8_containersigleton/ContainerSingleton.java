package com.ylcyouth.desigin.pattern.creational.p5_singleton.p8_containersigleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ylcyouth
 * @create 2019/6/9 11:39
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap<String, Object>(16);

    private ContainerSingleton() {}

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
