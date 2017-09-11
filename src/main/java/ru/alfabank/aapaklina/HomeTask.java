package ru.alfabank.aapaklina;

/**
 * Created by а on 11.09.2017.
 */
public class HomeTask {
    public static void main(String[] args) {

        class Product {
            String name;
            String color;
            Integer size;

            Product (String name, String color, Integer size){
                this.name = name;
                this.color = color;
                this.size = size;
            }
        }

        class Vegetable extends Product {
            String brand;

            Vegetable(String name, String color, Integer size) {
                super(name, color, size);
            }
        }

        class Linen extends Product{
            String fabricator;

            Linen(String name, String color, Integer size) {
                super(name, color, size);
            }
        }
    }
}
