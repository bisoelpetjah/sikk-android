package com.senyummanja.sikk;

import com.firebase.client.Firebase;

/**
 * Created by irvan on 12/6/15.
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
