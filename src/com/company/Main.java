package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Main {

    private static final int instancs_size = 10;

    public static void main(String[] args) {
        // write your code here
        //methond1();
        testjava();



    }

    private static void testjava() {
        //region Description
        System.out.println(1);
        System.out.println(1);
        ArrayList s = new ArrayList();
        //endregion


        Date date = new Date();

        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("1");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        ArrayList<Object> objectmmui = new ArrayList<>();
    }


    public static void test() {

        int num = 0;

        try {
            FileInputStream s = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }

        try {
            FileInputStream s1 = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
