package com.gathipay.creational;

public class DoubleCheckedSingleton {

    // The single instance, initially null, marked as volatile
    /*It uses the volatile keyword to ensure that changes to the 
    instance variable are immediately visible to other threads. */
    private static volatile DoubleCheckedSingleton instance;

    // Private constructor to prevent instantiation
    private DoubleCheckedSingleton() {}

    // Public method to get the instance
    public static DoubleCheckedSingleton getInstance() {
         // First check (not synchronized)
        if (instance == null) {
            // Synchronize on the class object
            synchronized (DoubleCheckedSingleton.class) {
                // Second check (synchronized)
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        // Return the instance (either newly created or existing)
        return instance;
    }
    /* Although this method is a bit complex to implement, 
    it can drastically reduce the performance overhead.*/
}
