package com.draumateymid.HelloWorld;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;


public class HelloWorldTest{
 
   @Test
    public void HelloWorld() {
        World w = new World();
        assertThat(w.greet(),containsString("Hell"));
    }

}

