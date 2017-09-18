package ru.alfabank.aapaklina;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import jdk.nashorn.internal.runtime.StoredScript;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by а on 11.09.2017.
 */
public class HomeTask {

    public static void main(String[] args) {
        Store store1 = new Store();
        
    }

    static class Store {

        public static void main(String[] args) {
            List<Product.Vegetabl> store1 = new ArrayList<Product.Vegetabl>();
            store1.add(new Product.Vegetabl("огурец", "зеленый", 15));

            List<Product.Linen> store2 = new ArrayList<Product.Linen>();
            store2.add(new Product.Linen("постельное белье", "красный", 200));
        }
    }

    static class Product {
        String name;
        String color;
        Integer size;

        Product(String name, String color, Integer size) {
            this.name = name;
            this.color = color;
            this.size = size;
        }


        static class Vegetabl extends Product {
            String brand;

            Vegetabl(String name, String color, Integer size) {
                super(name, color, size);
            }
        }

        static class Linen extends Product {
            String fabricator;

            Linen(String name, String color, Integer size) {
                super(name, color, size);
            }
        }
    }

}


