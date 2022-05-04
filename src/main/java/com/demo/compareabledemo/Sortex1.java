package com.demo.compareabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Sortex1 {

    public static void main(String[] args) {

        List<String> li= new ArrayList<>();

        li.add("ram");
        li.add("abi");
        li.add("bhanu");
        li.add("dhrashan");

        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);

        HashMap<Integer,String> hmap= new HashMap<>();
        hmap.put(2,"ram");
        hmap.put(1,"bhanu");
        hmap.put(3,"dharashan");
        hmap.put(4,"abi");
        System.out.println(hmap);
     //   Collections.sort(hmap);


    }
}
