package test.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class hashMapTest {
    public static void main(String[] args) {
//        ConcurrentMap concurrentMap=new ConcurrentHashMap();
//        concurrentMap.put("id",123456);
        Map<String,Object> map=new HashMap<>();
        map.put("16",16L);
        map.put("17",17);
        Object a=map.get("16");
        System.out.println(a);

    }

}
