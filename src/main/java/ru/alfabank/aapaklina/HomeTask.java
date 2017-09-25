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

        store1.vegetables.add(new Vegetable("огурец", "зеленый", 12));
        store1.linens.add(new Linen("белье", "белое", 200));
    }

    static class Store {

        Integer field1;
        List<Vegetable> vegetables = new ArrayList<>();
        List<Linen> linens = new ArrayList<>();



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
    }

        static class Vegetable extends Product {
            String brand;

            Vegetable(String name, String color, Integer size) {
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



