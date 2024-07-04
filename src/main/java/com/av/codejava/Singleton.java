package com.av.codejava;
    /*
    This implementation ensures that the Singleton instance is created in a thread-safe manner and
    prevents cloning and serialization from creating new instances.
     */
public class Singleton {
    /*
     >Private static instance of the class
     >The instance variable is marked as volatile to ensure that changes to the instance
     are visible to all threads.
     */
    private static volatile Singleton instance = null;

    /*
    The constructor is private to prevent instantiation from other classes.
    An additional check inside the constructor throws an exception if reflection is used-
    to create another instance.
       */
    private Singleton(){
        // Prevent reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }
    /*
    Double-checked locking is used to ensure that only one instance is created, and the synchronized
    block is used only when the instance is null.
     */
    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Override clone method to prevent cloning
    /*
    The clone method is overridden to throw a CloneNotSupportedException,
    preventing cloning of the Singleton instance.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this object is not allowed");
    }

    // Prevent serialization from creating a new instance
    /*
    The readResolve method is implemented to ensure that the same instance is returned
    when the object is deserialized.
     */
    protected Object readResolve() {
        return getInstance();
    }
}
