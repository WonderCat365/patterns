package pavel.kavaliuk;

import pavel.kavaliuk.generative.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        singleton();
    }

    private static void singleton() {
        Singleton singleton = Singleton.getInstance("Some instance");
        System.out.println(singleton);
        Singleton otherOneSingleton = Singleton.getInstance("Other instance");
        System.out.println(otherOneSingleton);
    }
}
