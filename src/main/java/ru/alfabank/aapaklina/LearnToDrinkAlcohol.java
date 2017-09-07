package ru.alfabank.aapaklina;

/**
 * Created by а on 30.08.2017.
 */
public class LearnToDrinkAlcohol {

    public static void main(String[] args) {
//        Cocktail drink = new Cocktail();
//        Beer drink1 = new Beer();
//        Beer drink2 = new Franziskaner();
//        Beer drink3 = new CherryBeer();
//        Cocktail drink4 = new MilkShake();
//        Heated shake = new MilkShake();
//        Heated cherry = new CherryBeer();
//
//        drink.say();
//        drink1.say();
//        drink1.desecrate();
//        drink2.say();
//        drink2.desecrate();
//        drink3.say();
//        drink3.desecrate();
//        drink4.say();
//        shake.heat();
//        cherry.heat();

        Duck d1 = new GrayDuck("Моя утя", 45);

        System.out.println("имя утки: " + d1.name);
        System.out.println("возраст утки: " + d1.age);
    }
}


class Duck {

    String name;
    Integer age;

    Duck(String myName, Integer myAge) {
        name = myName;
        age = myAge;
        System.out.println("создаю утку 1");
    }
}

class GrayDuck extends Duck {

    GrayDuck(String myName, Integer myAge) {
        super(myName, myAge);
        System.out.println("создаю утку 2");
    }
}

//
//interface Heated {
//    void heat();
//}
//
//class Cocktail {
//    String name;
//
//    Cocktail(String myName) {
//        name = myName;
//    }
//
//    public void say() {
//        System.out.println(name);
//    }
//}
//
//class MilkShake extends Cocktail implements Heated {
//    public void say() {
//        System.out.println("Я - грустный безалкогольный молочный коктейль!");
//    }
//
//    public void heat() {
//        System.out.println("Я теперь еще более грустный коктейль, потому что теплый!");
//    }
//}
//
//class Beer extends Cocktail {
//
//    Beer() {
//        super("ia pivo");
//    }
//
//    public void say() {
//        System.out.println("Я - пивасик!");
//    }
//
//    public void desecrate() {
//        System.out.println("чпок, добрый вечер!");
//    }
//
//}
//
//class Franziskaner extends Beer {
//    public void say() {
//        System.out.println("Я булькаю!");
//    }
//}
//
//class CherryBeer extends Beer implements Heated {
//    public void say() {
//        System.out.println("Я - годный вишневый пивасик!");
//    }
//
//    public void heat() {
//        System.out.println("Я - противное теплое пиво!");
//    }
//}
//

