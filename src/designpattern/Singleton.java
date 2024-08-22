package designpattern;

public class Singleton {

    //Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.
    //Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"
    //An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".
    private volatile static Singleton singelton;

    private Singleton() {
        System.out.println("object created");

    }

    public static Singleton getSingelton() {
        if (singelton == null) {
            synchronized (Singleton.class) {

                if (singelton == null) {
                    singelton = new Singleton();
                }
            }
        }
        return singelton;
    }
}
