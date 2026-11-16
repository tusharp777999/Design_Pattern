package com.tushar.creational.pattern.singleton;

public class Program07_Common_Utils implements Cloneable{

    //We override to increase method visibility. From protected to public.
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
