package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        GreetingTest test = new GreetingTest();
        test.setName(name);
        // check class interfaces
        System.out.println("GreetingTest implemented interfaces: "+ GreetingTest.class.getInterfaces().length);
        for (Class interfaceclass : GreetingTest.class.getInterfaces()) {
            System.out.println("GreetingTest implemented interfaces: "+ interfaceclass.getName());
        }
        return "hello " + name;
    }

}
