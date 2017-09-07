package ru.alfabank.aapaklina;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by а on 07.09.2017.
 */
public class LearningCollections {
    public static void main(String[] args) {


        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Vegetable("огурец"));
        vegetables.add(new Vegetable("томат"));
        vegetables.add(new Vegetable("огурец"));


        for (Vegetable x : vegetables) {
            System.out.println(x);
        }
    }

}

class Vegetable extends Object {
    String name;

    public Vegetable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}