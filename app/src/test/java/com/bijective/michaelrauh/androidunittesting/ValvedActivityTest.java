package com.bijective.michaelrauh.androidunittesting;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.fail;

public class ValvedActivityTest {

    ValvedActivity subject;

    @Before
    public void setUp() throws Exception {
        subject = new ValvedActivity();
    }

    @Test
    public void onCreateShouldNotThrowWhenValveIsClosed() {
        subject.closeValve();

        subject.onCreate(null);
    }

    @Test
    public void onCreateShouldThrowWhenValveIsOpen() {
        try {
            subject.onCreate(null);
            fail();
        } catch (Exception e) {
            assertSame(e.getClass(), RuntimeException.class);
        }
    }
}
