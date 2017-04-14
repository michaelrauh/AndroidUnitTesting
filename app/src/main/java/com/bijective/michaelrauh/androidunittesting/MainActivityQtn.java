package com.bijective.michaelrauh.androidunittesting;

import android.os.Bundle;

public class MainActivityQtn extends ValvedActivity {

    public MainActivityImpl impl = new MainActivityImpl();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        impl.onCreate(this);
    }
}
