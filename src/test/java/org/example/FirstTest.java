package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
    @Test
    public void testApp(){
    App app = new App();
    String actRes = app.sayHi("Jora");
    String expRes = ("Hi, Jor");
        Assert.assertEquals("Не очень!",expRes,actRes);
    }
}
