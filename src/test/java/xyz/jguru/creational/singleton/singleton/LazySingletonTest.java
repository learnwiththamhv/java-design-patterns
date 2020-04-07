package xyz.jguru.creational.singleton.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LazySingletonTest {

    LazySingleton lazySingleton = LazySingleton.getInstance();

    @Test
    public void getInstance() {
        assertNotNull(lazySingleton);
    }
}