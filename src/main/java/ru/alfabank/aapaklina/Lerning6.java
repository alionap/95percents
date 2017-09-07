package ru.alfabank.aapaklina;

/**
 * Created by а on 07.09.2017.
 */
public class Lerning6 {
    public static void main(String[] args) {

//        class Stock

        class Product {

            Integer weight;
            String name;
            String color;

            Product(Integer weight, String name, String color) {
                this.weight = weight;
                this.name = name;
                this.color = color;
            }
        }

        class Vegetables extends Product {
            String[] name1 = {"помидор", "огурец, перец болгарский"};

            Vegetables(Integer weight, String name, String color) {
                super(weight, name, color);
            }
        }

        class Linens extends Product {
            String[] name2 = {"в цветочек, в горошек, в какашку"};

            Linens(Integer weight, String name, String color) {
                super(weight, name, color);
            }
        }


    }

}
