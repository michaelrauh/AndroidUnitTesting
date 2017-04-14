package com.bijective.michaelrauh.androidunittesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityImplTest {

    MainActivityImpl subject;

    @Before
    public void setUp() {
        subject = new MainActivityImpl();
    }

    @Test
    public void onCreateShouldSetContentView() {
        MainActivityQtn mockQtn = mock(MainActivityQtn.class);

        subject.onCreate(mockQtn);

        verify(mockQtn).setContentView(R.layout.activity_main);
    }
}