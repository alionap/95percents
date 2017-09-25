package ru.alfabank;

import org.apache.commons.lang3.ObjectUtils;

/**
 * Created by а on 19.09.2017.
 */
public class LearningExceptions {
    public static void main(String[] args) {
        try {
            foo();
        } catch (NullPointerException | ValidationException e) {
            throw new RuntimeException("jflsdkfjsd", e);
        }finally {
            System.out.println("ОЙ");
        }

        System.out.println("Пока!");
    }


    static void foo() {
        Bar bar;
        bar = new Bar();
        bar.baz();

        System.out.println("Привет!");

        throw new ValidationException();

//        System.out.println("Пока!");
    }

}

class Bar {
    void baz() {
    }
}