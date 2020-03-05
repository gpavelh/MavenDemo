package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public String sayHi(String name) {
        String str = String.format("Hi, " + name);
        LOG.error(str);
        LOG.info(str);
        LOG.warn(str);
        LOG.trace(str);
        return str;
    }
}
