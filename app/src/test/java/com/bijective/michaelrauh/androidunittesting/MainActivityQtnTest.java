package com.bijective.michaelrauh.androidunittesting;

import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class MainActivityQtnTest {

    @Mock
    MainActivityImpl mockImpl;

    @InjectMocks
    MainActivityQtn subject;

    @Before
    public void setUp() throws Exception {
        subject.closeValve();
    }

    @Test
    public void DefaultsCollaborators() {
        MainActivityQtn subject = new MainActivityQtn();

        assertSame(MainActivityImpl.class, subject.impl.getClass());
    }

    @Test
    public void onCreateShouldDelegateProperly() {
        subject.onCreate(mock(Bundle.class));

        verify(mockImpl).onCreate(subject);
    }
}
