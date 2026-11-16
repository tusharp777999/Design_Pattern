package com.tushar.creational.pattern.singleton;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
/**
 * Here the URLClassLoader is independent ClassLoader and not linked to JVM's ClassLoader SubSystem.
 * So one object is created using ApplicationClassLoader of ClassLoader SubSystem and second object is created
 * using URLClassLoader(Custom ClassLoader).
 * Note: There is no solution from Singleton java class perspective. Nothing is possible inside Singleton java
 * class which will stop
 * */
public class Program11_ClassLoaderToBreakSingleton {
    static void main() {
        try {
            System.out.println("===Using Applicatin ClassLoader.===");
            Program02_Solution01_SingletonPattern program02_Solution01_SingletonPattern = Program02_Solution01_SingletonPattern.getInstance();
            System.out.println(program02_Solution01_SingletonPattern.getClass().getClassLoader());
            //Program03_Solution02_SingletonPattern program03_Solution02_SingletonPattern = Program03_Solution02_SingletonPattern.getInstance();

            System.out.println("===Using URLClassLoader(Readymade Custom ClassLoader.)===");
            File jarFile = new File(
                    "/Users/tushar/Projects/Design_Pattern/src/main/java/com/tushar/creational/pattern/singleton/Design_Pattern-1.0-SNAPSHOT.jar"
            );

            URL[] urls = {jarFile.toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, null);//No internal Class Loader hierarchy it should use hence it is null only preference to Custom Class Loader.
            Class<?> clazz = urlClassLoader.loadClass("com.tushar.creational.pattern.singleton.Program02_Solution01_SingletonPattern");
            Method method = clazz.getMethod("getInstance", new Class[]{});//No arguments to the method hence empty class array.
            //Object object = clazz.getEnumConstants()[0]; //Get INSTANCE from the dynamically loaded Enum
            Object object = method.invoke(null);//invoking the method without parameter hence it is null.
            System.out.println("Object hashCode: " + object.hashCode());
            System.out.println("program02_Solution01_SingletonPattern hashCode: " + program02_Solution01_SingletonPattern.hashCode());
            //System.out.println("program03_Solution02_SingletonPattern: " + program03_Solution02_SingletonPattern.hashCode());
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
