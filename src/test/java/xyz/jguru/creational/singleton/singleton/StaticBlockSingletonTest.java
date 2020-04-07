package xyz.jguru.creational.singleton.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class StaticBlockSingletonTest {

    StaticBlockSingleton sbs = StaticBlockSingleton.getInstance();

    @Test
    public void getInstance() {
        assertNull(sbs);
    }
}