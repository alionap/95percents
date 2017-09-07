package ru.alfabank.aapaklina;

/**
 * Created by а on 29.08.2017.
 */
public class LearningInheritance {

    public static void main(String[] args) {
        CanRide car = new Car();
        CanSwim boat = new Boat();
        CanSwim amphibian = new Amfibia();

        car.ride();
        boat.swim();
        amphibian.swim();

    }
}


interface CanRide {
    void ride();
}

interface CanSwim {
    void swim();
}

class  Car implements CanRide{
    public void ride() {
        System.out.println("Я - биби!!!");
    }
}

class Boat implements CanSwim{
    public void swim(){
        System.out.println("Я - рыбка!!!");
    }
}

class Amfibia implements CanSwim, CanRide{
    @Override
    public void ride() {
        System.out.println("Я не существую!");
    }

    @Override
    public void swim() {
        System.out.println("Или существую?");
    }
}


//        Bird bird1 = new Bird();
//        Bird bird2 = new Chicken();
//        Bird bird3 = new Duck();
//
//        bird1.fly();
//        bird2.fly();
//        bird3.fly();
//
//
//    }
//
//}

//class Duck extends Bird {
//    void fly() {
//
//        System.out.println("Привет, я утка!");
//    }
//}
//
//class Chicken extends Bird {
//    @Override
//    void fly() {
//
//        System.out.println("Привет, я курица!");
//    }
//}
//
//class Bird {
//
//    void fly() {
//
//        System.out.println("А я птица!");
//    }
//}

