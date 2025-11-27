package com.cubisoft.creational;

public class ThreadSafeSingleton {

    // The single instance, initially null
    private static ThreadSafeSingleton instance;

    // Private constructor to prevent instantiation
    private ThreadSafeSingleton() {}

    // Public method to get the instance
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    /* Although this approach is straightforward, using synchronized can cause substantial 
    overhead and reduce performance, which can be a bottleneck if called frequently.*/

}
