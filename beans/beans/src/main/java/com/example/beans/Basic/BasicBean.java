package com.spring.beans.basic;

/*
 * BasicBean is an ordinary Java class. It does not need a Spring annotation
 * because BeanConfiguration creates and registers it with @Bean.
 *
 * A bean is not a special kind of Java object. It is simply an object that
 * Spring creates, stores, and provides from its application context.
 */
public class BasicBean {

    /*
     * private restricts access to this class.
     * final means name is assigned once in the constructor and cannot
     * be reassigned later.
     */
    private final String name;

    /*
     * A constructor initializes a new BasicBean.
     * For example, new BasicBean("Spring bean") stores that text in name.
     */
    public BasicBean(String name) {
        this.name = name;
    }

    /*
     * This is a normal public Java method. Code holding a BasicBean
     * reference can call it, whether the object came from Spring or new.
     */
    public String greet() {
        return "Hello, " + name + "!";
    }
}