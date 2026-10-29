package com.spring.beans.Basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @Configuration tells Spring that this class contains instructions for
 * creating beans. It is a Java-based alternative to defining beans in
 * an XML configuration file.
 *
 * Think of this class as a recipe book:
 * - the class is the recipe book;
 * - the @Bean method is one recipe; and
 * - the returned object is the finished bean.
 */
@Configuration
public class BeanConfiguration {

    /*
     * @Bean tells Spring to call this method and manage the returned
     * BasicBean object in the application context.
     *
     * The method name, basicBean, normally becomes the bean name.
     */
    @Bean
    public BasicBean basicBean() {
        // "new" creates the object; Spring then stores and manages it.
        return new BasicBean("Spring bean");
    }

}