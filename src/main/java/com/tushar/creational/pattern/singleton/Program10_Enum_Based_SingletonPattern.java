package com.tushar.creational.pattern.singleton;

public enum Program10_Enum_Based_SingletonPattern {
    INSTANCE;
    public static Program10_Enum_Based_SingletonPattern getInstance(){
        return INSTANCE;
    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}

/*
Java internally converts enum as below:
enum cannot extend any other class because it already extends Enum class so multiple inheritance not possible
enum only able to implement interface
Our enum extends Enum class internally and Enum class extends Object class. The clone method is protected which is
available only in Enum class not in our defined enum. Cloning is not possible in any way.
Even if you think using Cloneable interface we can do this but this method already overridden in Enum class with
final so we cannot be able to override it.
Even the Enum class implements Serializable interface but still it returns the same object and not even written any
readResolve() method anywhere. The reason is below

What happens internally?
This is the important part.
During normal object deserialization, Java generally reconstructs an object using its serialized state.
But enum deserialization follows a special mechanism.
Internally, Java uses the enum's name to identify the constant.
Singleton.INSTANCE
During serialization, Java stores the enum constant's name, essentially:
"INSTANCE"
During deserialization, Java uses a special internal method called:
Enum.valueOf(enumClass, constantName)
Conceptually, it does something like:
Singleton s2 = Enum.valueOf(
    Singleton.class,
    "INSTANCE"
);
Enum.valueOf() returns the existing enum constant.
It does not create a new object.

For example:

public final class Program10_Enum_Based_SingletonPattern
        extends Enum<Program10_Enum_Based_SingletonPattern> {

    public static final Program10_Enum_Based_SingletonPattern INSTANCE;

    static {
        INSTANCE = new Program10_Enum_Based_SingletonPattern();
    }

    private Program10_Enum_Based_SingletonPattern() {
        super("INSTANCE", 0);
    }
}*/
