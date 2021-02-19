package com.it.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author ch
 * @date 2021-2-19
 */
public class JamesFactoryBean implements FactoryBean<Monkey> {

    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    public Class<?> getObjectType() {
        return Monkey.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
