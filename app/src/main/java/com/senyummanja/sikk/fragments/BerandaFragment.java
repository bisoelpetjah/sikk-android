package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.senyummanja.sikk.AktorDetailActivity_;
import com.senyummanja.sikk.KasusDetailActivity_;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.interfaces.OnAktorItemClickListener;
import com.senyummanja.sikk.interfaces.OnKasusItemClickListener;
import com.senyummanja.sikk.models.Aktor;
import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.views.AktorBerandaListItemView;
import com.senyummanja.sikk.views.AktorBerandaListItemView_;
import com.senyummanja.sikk.views.AktorListItemView;
import com.senyummanja.sikk.views.AktorListItemView_;
import com.senyummanja.sikk.views.KasusBerandaListItemView;
import com.senyummanja.sikk.views.KasusBerandaListItemView_;
import com.senyummanja.sikk.views.KasusListItemView;
import com.senyummanja.sikk.views.KasusListItemView_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_beranda)
public class BerandaFragment extends Fragment implements OnKasusItemClickListener, OnAktorItemClickListener {

    @ViewById(R.id.pilihan)
    protected LinearLayout linearLayoutPilihan;

    @ViewById(R.id.kasus)
    protected LinearLayout linearLayoutKasus;

    @ViewById(R.id.aktor)
    protected LinearLayout linearLayoutAktor;

    @ViewById(R.id.trivia)
    protected TextView textViewTrivia;

    @AfterViews
    protected void initViews() {
        KasusBerandaListItemView kasusBerandaItemView = KasusBerandaListItemView_.build(getActivity());
        Kasus kasus = new Kasus();
        kasus.nama = "Kasus Papa Minta Saham";
        kasus.sinopsis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vestibulum ipsum elit, eget tempor justo mollis vel.";
        kasusBerandaItemView.setOnKasusItemClickListener(this);
        kasusBerandaItemView.setKasus(kasus);
        linearLayoutPilihan.addView(kasusBerandaItemView);

        AktorBerandaListItemView aktorBerandaItemView = AktorBerandaListItemView_.build(getActivity());
        Aktor aktor = new Aktor();
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.nama = "Muhammad Jesus Gautama";
        aktor.sinopsis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vestibulum ipsum elit, eget tempor justo mollis vel.";
        aktorBerandaItemView.setOnAktorItemClickListener(this);
        aktorBerandaItemView.setAktor(aktor);
        linearLayoutPilihan.addView(aktorBerandaItemView);

        kasusBerandaItemView = KasusBerandaListItemView_.build(getActivity());
        kasus = new Kasus();
        kasus.nama = "Kasus Mama Minta Pulsa";
        kasus.sinopsis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vestibulum ipsum elit, eget tempor justo mollis vel. Nulla eget neque auctor purus rhoncus ornare in nec mauris. Sed in luctus risus. Donec id orci et eros fringilla tempor id non mi. Quisque id enim sed dui tincidunt lacinia non ac nibh.";
        kasusBerandaItemView.setOnKasusItemClickListener(this);
        kasusBerandaItemView.setKasus(kasus);
        linearLayoutPilihan.addView(kasusBerandaItemView);

        KasusListItemView kasusItemView = KasusListItemView_.build(getActivity());
        kasus = new Kasus();
        kasus.nama = "Kasus Korupsi Daging Sapi";
        kasus.time = 20;
        kasus.watch = 150;
        kasus.aktor.nama = "Tifatul Sembiring";
        kasusItemView.setOnKasusItemClickListener(this);
        kasusItemView.setKasus(kasus);
        linearLayoutKasus.addView(kasusItemView);

        kasusItemView = KasusListItemView_.build(getActivity());
        kasus = new Kasus();
        kasus.nama = "Kasus Korupsi Daging Kambing";
        kasus.time = 25;
        kasus.watch = 120;
        kasus.aktor.nama = "Johannes Ridho";
        kasusItemView.setOnKasusItemClickListener(this);
        kasusItemView.setKasus(kasus);
        linearLayoutKasus.addView(kasusItemView);

        kasusItemView = KasusListItemView_.build(getActivity());
        kasus = new Kasus();
        kasus.nama = "Kasus Korupsi Daging Ayam";
        kasus.time = 15;
        kasus.watch = 100;
        kasus.aktor.nama = "Sule";
        kasusItemView.setOnKasusItemClickListener(this);
        kasusItemView.setKasus(kasus);
        linearLayoutKasus.addView(kasusItemView);

        AktorListItemView aktorItemView = AktorListItemView_.build(getActivity());
        aktor = new Aktor();
        aktor.nama = "Subur";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Orang Pintar";
        aktor.nilai = "Rp1.500.000.000,00";
        aktorItemView.setOnAktorItemClickListener(this);
        aktorItemView.setAktor(aktor);
        linearLayoutAktor.addView(aktorItemView);

        aktorItemView = AktorListItemView_.build(getActivity());
        aktor = new Aktor();
        aktor.nama = "Tatang Sutarma";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Orang Bodoh";
        aktor.nilai = "Rp150.000.000,00";
        aktorItemView.setOnAktorItemClickListener(this);
        aktorItemView.setAktor(aktor);
        linearLayoutAktor.addView(aktorItemView);

        textViewTrivia.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vestibulum ipsum elit, eget tempor justo mollis vel. Nulla eget neque auctor purus rhoncus ornare in nec mauris. Sed in luctus risus. Donec id orci et eros fringilla tempor id non mi. Quisque id enim sed dui tincidunt lacinia non ac nibh. Vestibulum nulla mi, hendrerit eu tempor sit amet, pretium non massa. Nulla cursus tellus et porta rhoncus. Morbi eget augue bibendum, auctor nunc tristique, iaculis nisi. Proin lectus lacus, pharetra vitae luctus tincidunt, condimentum in ipsum. Sed orci lacus, gravida sodales porttitor quis, ornare vitae neque. Nunc sollicitudin viverra turpis nec hendrerit.");
    }

    @Override
    public void onKasusItemClick(Kasus kasus) {
        KasusDetailActivity_.intent(this).start();
    }

    @Override
    public void onAktorItemClick(Aktor aktor) {
        AktorDetailActivity_.intent(this).start();
    }
}
