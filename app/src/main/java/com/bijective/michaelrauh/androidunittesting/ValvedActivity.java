package com.bijective.michaelrauh.androidunittesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

class ValvedActivity extends AppCompatActivity {

    private boolean valveOpen = true;

    public void closeValve() {
        this.valveOpen = false;
    }

    @Override
    protected void onCreate(Bundle bundle){
        if (valveOpen) {super.onCreate(bundle);}
    }
}
