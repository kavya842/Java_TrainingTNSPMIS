package com.example.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * This example demonstrates a component bean.
 *
 * A class marked with @Component is a candidate for Spring to manage.
 * In a normal Spring Boot application, component scanning discovers it
 * automatically. Here we register GreetingService manually so that the
 * example can run as a small, independent Java program.
 *
 * Without Spring, we could write:
 *
 *     GreetingService service = new GreetingService();
 *
 * With Spring, the container creates and stores the object for us.
 * We then ask the container for it using getBean().
 */
public class ComponentBeanExample {

    public static void main(String[] args) {
        /*
         * AnnotationConfigApplicationContext is a Spring container that
         * understands Java annotations and Java-based configuration.
         *
         * This constructor creates an empty container. It does not know
         * about GreetingService yet.
         */
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            /*
             * register() tells Spring which class should be managed.
             * GreetingService.class means "the Class object describing
             * GreetingService", not an object created with new.
             */
            context.register(GreetingService.class);

            /*
             * refresh() starts/prepares the context. During this step,
             * Spring creates the registered GreetingService bean.
             */
            context.refresh();

            /*
             * getBean() retrieves the object managed by Spring.
             * The returned object is assigned to the service variable,
             * so we can call its normal Java method.
             */
            GreetingService service = context.getBean(GreetingService.class);
            System.out.println(service.greet("Spring learner"));
        }
    }
}