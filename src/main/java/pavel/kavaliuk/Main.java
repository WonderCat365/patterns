package pavel.kavaliuk;

import lombok.extern.slf4j.Slf4j;
import pavel.kavaliuk.generative.singleton.Singleton;

@Slf4j
public class Main {

    public static void main(String[] args) {
        singleton();
    }

    private static void singleton() {
        final Singleton singleton = Singleton.getInstance("Some instance");
        log.info(String.valueOf(singleton));

        final Singleton otherOneSingleton = Singleton.getInstance("Other instance");
        log.info(String.valueOf(otherOneSingleton));
    }
}
