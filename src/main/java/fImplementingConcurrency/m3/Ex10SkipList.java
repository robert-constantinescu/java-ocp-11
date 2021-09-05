package fImplementingConcurrency.m3;

import java.util.Map;
import java.util.concurrent.*;

public class Ex10SkipList {

    public static void main(String[] args) {

        // SkipList collection, they actually represent a natural orders collection

        // for example if we have ConcurrentSkipListSet
        // the below will always be in  natural order(this case alphabetical)
        // other than optimization for multithreading
        //    - it behaves like a normal set
        ConcurrentSkipListSet<String> skipListSet = new ConcurrentSkipListSet<>();
        skipListSet.add("wagner");
        skipListSet.add("tim");
        skipListSet.add("john");

        System.out.println(skipListSet);

        // the below will always be in natural order(this case alphabetical) based on the keys
        // other than optimization for multithreading
        //    - it behaves like a normal map
        Map<String, String> skipListMap = new ConcurrentSkipListMap<>();
        skipListMap.put("mercedes", "wagner");
        skipListMap.put("ford", "tim");
        skipListMap.put("dacia", "john");

        System.out.println(skipListMap);



    }
}
