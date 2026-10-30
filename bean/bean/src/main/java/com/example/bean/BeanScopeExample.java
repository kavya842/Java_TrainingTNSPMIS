package com.example.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Singleton scope is Spring's default scope. Spring creates one object
 * per application context and returns that same object every time
 * getBean() is called.
 *
 * Prototype scope creates a new object every time getBean() is called.
 * Therefore, two prototype requests return different objects.
 *
 * For example:
 *
 *     firstSingleton  ---> SingletonBean object A
 *     secondSingleton ---> SingletonBean object A
 *
 *     firstPrototype  ---> PrototypeBean object B
 *     secondPrototype ---> PrototypeBean object C
 *
 * The comparisons below use == to show whether the requested references
 * point to the same object in memory.
 */
public class BeanScopeExample {

    public static void main(String[] args) {
        // Start a context using the bean definitions in ScopeConfiguration.
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ScopeConfiguration.class)) {
            /*
             * Spring returns the same singleton object for both requests.
             * Both variables point to the same object in memory.
             */
            SingletonBean firstSingleton = context.getBean(SingletonBean.class);
            SingletonBean secondSingleton = context.getBean(SingletonBean.class);

            /*
             * Spring creates a different prototype object for each request.
             * The two variables point to separate PrototypeBean objects.
             */
            PrototypeBean firstPrototype = context.getBean(PrototypeBean.class);
            PrototypeBean secondPrototype = context.getBean(PrototypeBean.class);

            // "==" compares object identity: whether both variables point
            // to the exact same object in memory.
            System.out.println("Singleton objects are the same: "
                    + (firstSingleton == secondSingleton));
            System.out.println("Prototype objects are the same: "
                    + (firstPrototype == secondPrototype));
        }
    }
}