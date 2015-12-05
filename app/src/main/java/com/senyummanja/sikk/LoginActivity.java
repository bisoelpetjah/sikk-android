package com.senyummanja.sikk;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

/**
 * Created by irvan on 12/4/15.
 */
@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    @Click(R.id.buttonLoginFacebook)
    protected void loginClicked() {
        ActivityOptionsCompat options = ActivityOptionsCompat.makeCustomAnimation(this, R.anim.zoom_in_enter, R.anim.zoom_out_exit);
        ActivityCompat.startActivity(this, MainActivity_.intent(this).get(), options.toBundle());
        ActivityCompat.finishAfterTransition(this);
    }
}
