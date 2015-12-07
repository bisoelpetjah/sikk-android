package com.senyummanja.sikk;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;

/**
 * Created by irvan on 12/4/15.
 */
@EActivity(R.layout.activity_splash)
public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 1500;

    private boolean isActive = true;

    @AfterViews
    protected void initViews() {
        splashTimeout();
    }

    @UiThread(delay = SPLASH_DELAY)
    protected void splashTimeout() {
        if (isActive) {
            ActivityOptionsCompat options = ActivityOptionsCompat.makeCustomAnimation(this, R.anim.zoom_in_enter, R.anim.zoom_out_exit);
            ActivityCompat.startActivity(this, MainActivity_.intent(this).get(), options.toBundle());
            ActivityCompat.finishAfterTransition(this);
        }
    }

    @Override
    protected void onDestroy() {
        isActive = false;
        super.onDestroy();
    }
}
