package com.spring.beans.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * This example demonstrates the @Bean approach.
 *
 * BeanConfiguration contains a method annotated with @Bean. That method
 * returns a BasicBean object, and Spring stores that object in its container.
 *
 * This approach is useful when:
 * - the class cannot be edited to add @Component;
 * - object creation needs custom configuration; or
 * - you want to make the creation process explicit.
 */
public class BeanMethodExample {

    public static void main(String[] args) {
        /*
         * AnnotationConfigApplicationContext is a small Spring container.
         * Passing BeanConfiguration.class tells Spring to read the @Bean
         * method from that configuration class.
         *
         * try-with-resources closes the context automatically at the end.
         * This is similar to calling context.close() manually.
         */
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(BeanConfiguration.class)) {
            /*
             * getBean() asks Spring for the BasicBean object created from
             * BeanConfiguration.basicBean().
             */
            BasicBean bean = context.getBean(BasicBean.class);
            System.out.println(bean.greet());
        }
    }
}