package ru.alfabank.aapaklina;

import javax.naming.Name;

/**
 * Created by а on 05.09.2017.
 */
public class LearnCycles {

    public static void main(String[] args) {
//           System.out.println("Burn, World");
//
//        for (Integer i = 0; i < 5; i = i + 1) {
//            System.out.println(i);
//        }
//
//        Integer x = 0;
//
//        while (x < 5) {
//            System.out.println(x);
//        }
//        x = x + 1;
//    }


        String[] names = new String[]{
                "vasya",
                "masha",
                "olya"
        };

        System.out.println(names[1]);
        System.out.println(names[2]);

        for (Integer z = 0; z < 3; z = z + 1){
            System.out.println(names[z]);
        }

    }


}
