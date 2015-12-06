package com.senyummanja.sikk;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/6/15.
 */
@EActivity(R.layout.activity_detail_kasus)
public class KasusDetailActivity extends AppCompatActivity {

    @ViewById(R.id.collapsingToolbar)
    protected CollapsingToolbarLayout collapsingToolbarLayout;

    @ViewById(R.id.toolbar)
    protected Toolbar toolbar;

    @AfterViews
    protected void initViews() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Kasus Papa Minta Saham");

        collapsingToolbarLayout.setExpandedTitleColor(Color.TRANSPARENT);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Click(R.id.aktor)
    protected void aktorClick() {
        AktorDetailActivity_.intent(this).start();
    }
}
