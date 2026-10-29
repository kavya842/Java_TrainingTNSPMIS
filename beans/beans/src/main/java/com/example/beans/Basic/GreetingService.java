package com.spring.beans.Basic;

import org.springframework.stereotype.Component;

/*
 * @Component marks this class as a component bean.
 *
 * In a normal Spring Boot application, component scanning searches the
 * application packages, finds this annotation, creates a GreetingService
 * object, and stores it in the Spring application context.
 *
 * In ComponentBeanExample, we register this class manually so the example
 * can use a small context without starting the complete application.
 */
@Component
public class GreetingService {

    /*
     * This is a regular business method. Spring manages the object, but
     * the method is still called like any normal Java method.
     *
     * Example:
     *     service.greet("Anish")
     * returns:
     *     Welcome, Anish!
     */
    public String greet(String name) {
        return "Welcome, " + name + "!";
    }
}
