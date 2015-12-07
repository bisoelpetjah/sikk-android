package com.senyummanja.sikk;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.senyummanja.sikk.fragments.adapters.AktorDetailPagerAdapter;
import com.senyummanja.sikk.models.Aktor;
import com.senyummanja.sikk.utils.RoundedDrawable;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

import nevet.me.wcviewpager.WrapContentViewPager;

/**
 * Created by irvan on 12/6/15.
 */
@EActivity(R.layout.activity_detail_aktor)
public class AktorDetailActivity extends AppCompatActivity {

    private static final String EXTRA_AKTOR = "aktor";

    @ViewById(R.id.collapsingToolbar)
    protected CollapsingToolbarLayout collapsingToolbarLayout;

    @ViewById(R.id.toolbar)
    protected Toolbar toolbar;

    @ViewById(R.id.tabs)
    protected TabLayout tabLayout;

    @ViewById(R.id.foto)
    protected ImageView imageViewFoto;

    @ViewById(R.id.nama)
    protected TextView textViewNama;

    @ViewById(R.id.nilai)
    protected TextView textViewNilai;

    @ViewById(R.id.viewPager)
    protected WrapContentViewPager viewPager;

    @Extra(EXTRA_AKTOR)
    protected Aktor aktor;

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

        viewPager.setOffscreenPageLimit(3);

        AktorDetailPagerAdapter pagerAdapter = new AktorDetailPagerAdapter(this, getSupportFragmentManager(), aktor);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        if (aktor != null) {
            getSupportActionBar().setTitle(aktor.nama);

            Glide.with(this)
                    .load(aktor.foto)
                    .asBitmap()
                    .centerCrop()
                    .into(RoundedDrawable.makeRoundedDrawableTarget(imageViewFoto));

            textViewNama.setText(aktor.nama);
            textViewNilai.setText(aktor.nilai);
        }
    }
}
