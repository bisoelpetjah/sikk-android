package com.senyummanja.sikk;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.views.KasusDetailTahapItemView;
import com.senyummanja.sikk.views.KasusDetailTahapItemView_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/6/15.
 */
@EActivity(R.layout.activity_detail_kasus)
public class KasusDetailActivity extends AppCompatActivity {

    private static final String EXTRA_KASUS = "kasus";

    @ViewById(R.id.collapsingToolbar)
    protected CollapsingToolbarLayout collapsingToolbarLayout;

    @ViewById(R.id.toolbar)
    protected Toolbar toolbar;

    @ViewById(R.id.namaKasus)
    protected TextView textViewNamaKasus;

    @ViewById(R.id.nilai)
    protected TextView textViewNilai;

    @ViewById(R.id.aktor)
    protected TextView textViewAktor;

    @ViewById(R.id.tahap)
    protected LinearLayout linearLayoutTahap;

    @Extra(EXTRA_KASUS)
    protected Kasus kasus;

    @AfterViews
    protected void initViews() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout.setExpandedTitleColor(Color.TRANSPARENT);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        if (kasus != null) {
            getSupportActionBar().setTitle(kasus.nama);

            textViewNamaKasus.setText(kasus.nama);
            textViewNilai.setText(kasus.aktor.nilai);
            textViewAktor.setText(kasus.aktor.nama);

            for (int i = kasus.progress; i >= 1; i--) {
                KasusDetailTahapItemView itemView = KasusDetailTahapItemView_.build(this);
                itemView.setProgress(i);
                linearLayoutTahap.addView(itemView);
            }
        }
    }

    @Click(R.id.aktor)
    protected void aktorClick() {
        AktorDetailActivity_.intent(this).aktor(kasus.aktor).start();
    }
}
