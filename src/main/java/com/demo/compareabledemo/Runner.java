package com.demo.compareabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public  static  void example1(){
        List<Laptop> lap= new ArrayList<>();
        lap.add(new Laptop(500,8,"Dell"));
        lap.add(new Laptop(1000,16,"Hp"));
        lap.add(new Laptop(1200,4,"Acer"));

        Collections.sort(lap);

        for(Laptop l:lap){
            System.out.println(l);
        }
    }
    public  static  void example2(){
        List<Laptop1> lap= new ArrayList<>();
        lap.add(new Laptop1(500,8,"Dell"));
        lap.add(new Laptop1(1000,16,"Hp"));
        lap.add(new Laptop1(1200,4,"Acer"));

        Comparator<Laptop1> lap1= new Comparator<Laptop1>() {
            @Override
            public int compare(Laptop1 l1, Laptop1 l2) {
                if (l1.getRom()>l2.getRom())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(lap,lap1);

        for(Laptop1 l:lap){
            System.out.println(l);
        }
    }


    public static void main(String[] args) {
example2();
    }
}
