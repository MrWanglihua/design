package com.example.design.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射的方式破坏单例
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Class<?> clazz = LazyInnerClassSingleton.class;

        try {
            Constructor con = clazz.getDeclaredConstructor(null);
            con.setAccessible(true);

            Object o1 = con.newInstance(null);
            Object o2 = con.newInstance(null);

            System.out.println(o1 == o2);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
