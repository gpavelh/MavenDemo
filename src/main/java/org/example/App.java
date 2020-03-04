package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public void sayHi(String name) {
        LOG.info("Hi {}!", name);
    }

    public static void main(String[] args) {
        App app = new App();
        app.sayHi("Петро");
    }
}
