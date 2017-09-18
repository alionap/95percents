package ru.alfabank.aapaklina;

import java.util.*;

/**
 * Created by а on 14.09.2017.
 */
public class MapsLearning {
    public static void main(String[] args) {
//        Collection<String> myStrings = new ArrayList<>();
//        myStrings.add("dog");
//        myStrings.add("cat");
//        myStrings.add("cat");
//        myStrings.add("duck");
//
//        for (String q : myStrings){
//            System.out.println(q);
//        }
//        System.out.println(myStrings.size());

        Map<String, Anketa> pos = new HashMap<>();
        pos.put("1", new Anketa("name"));
        pos.put("2", new Anketa("name1"));

        //System.out.println(pos.get("2").name);

        Set<String> keys = pos.keySet();
//        for (String w: keys){
//            System.out.println(pos.get(w).name);
//        }
//        Collection<Anketa> values = pos.values();
//        for (Anketa e: values){
//            System.out.println(e.name);
//        }
        Set<Map.Entry<String, Anketa>> entries = pos.entrySet();
        pos.remove("1");
        for (Map.Entry<String, Anketa> e: entries){
            System.out.println(e.getValue().name);
        }
    }

    static class Anketa {
        String name;

        public Anketa(String name) {
            this.name = name;
        }
    }


}
