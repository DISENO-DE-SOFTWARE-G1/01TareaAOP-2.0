package ec.edu.espol;

/**
 *
 */
public aspect SingletonAspect {
    private static Singleton instance = null;

    pointcut singletonCreation() : call(Singleton.new());

    Singleton around() : singletonCreation() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Singleton {
    private Singleton() {
        // Constructor privado
    }
}
