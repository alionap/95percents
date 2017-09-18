package ru.alfabank.aapaklina1;

import ru.alfabank.aapaklina1.aapaklina2.Dog;

/**
 * Created by а on 14.09.2017.
 */
public class LearnAccessModificators {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        duck1.setName("111");

        Dog dog1 = new Dog();
        dog1.setName("xxx");

        System.out.println(dog1.getName());
    }

}
