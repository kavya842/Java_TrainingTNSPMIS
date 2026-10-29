package com.spring.beans.Basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * This example demonstrates constructor dependency injection.
 *
 * MessageService depends on MessageRepository. We register both classes
 * with the Spring container. Spring sees the constructor parameter and
 * passes the MessageRepository bean into MessageService automatically.
 *
 * This is preferable to manually constructing dependencies because the
 * service is loosely coupled and easier to test or replace later.
 */
public class ConstructorInjectionExample {

    public static void main(String[] args) {
        // Create an empty annotation-based Spring container.
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            /*
             * register() adds both classes to the container.
             * refresh() below causes Spring to create them and resolve
             * the constructor dependency between them.
             */
            context.register(MessageRepository.class, MessageService.class);
            context.refresh();

            // Retrieve the fully-created service and call its method.
            MessageService service = context.getBean(MessageService.class);
            System.out.println(service.getMessage());
        }
    }
}
