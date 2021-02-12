package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        GreetingTest test = new GreetingTest();
        test.setName(name);
        return "hello " + name;
    }

}
