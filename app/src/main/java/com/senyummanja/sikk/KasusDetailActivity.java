package com.senyummanja.sikk;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/6/15.
 */
@EActivity(R.layout.activity_detail_kasus)
public class KasusDetailActivity extends AppCompatActivity {

    @ViewById(R.id.toolbar)
    protected Toolbar toolbar;

    @AfterViews
    protected void initViews() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Kasus Papa Minta Saham");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
