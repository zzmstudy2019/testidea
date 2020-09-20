package com.company.test;

import java.util.HashMap;

/**
 * @author zzm
 * @date 2020-09-20 16:08
 */
public class DebugTest {

    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap map = new HashMap<>();
        map.put("name","tom");
        map.put("age","12");
        map.put("major","tom");

        String age = (String) map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);

    }

}
