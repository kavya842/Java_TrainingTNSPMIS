package com.spring.beans.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/*
 * This configuration contains two beans with different lifecycles.
 *
 * A bean scope tells Spring how many objects to create and how long
 * those objects should be reused.
 */
@Configuration
public class ScopeConfiguration {

    /*
     * Singleton is the default scope. Spring creates one SingletonBean
     * object for this application context and returns that same object
     * for every getBean(SingletonBean.class) call.
     */
    @Bean
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }

    /*
     * @Scope changes the default lifecycle.
     * SCOPE_PROTOTYPE tells Spring to create a new PrototypeBean object
     * every time the bean is requested with getBean().
     */
    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}