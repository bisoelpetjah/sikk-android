package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.widget.LinearLayout;

import com.senyummanja.sikk.AktorDetailActivity_;
import com.senyummanja.sikk.KasusDetailActivity_;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.models.Aktor;
import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.views.AktorBerandaListItemView;
import com.senyummanja.sikk.views.AktorBerandaListItemView_;
import com.senyummanja.sikk.views.KasusBerandaListItemView;
import com.senyummanja.sikk.views.KasusBerandaListItemView_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_beranda)
public class BerandaFragment extends Fragment implements KasusBerandaListItemView.OnItemClickListener, AktorBerandaListItemView.OnItemClickListener {

    @ViewById(R.id.pilihan)
    protected LinearLayout linearLayoutPilihan;

    @AfterViews
    protected void initViews() {
        KasusBerandaListItemView kasusItemView = KasusBerandaListItemView_.build(getActivity());
        Kasus kasus = new Kasus();
        kasus.nama = "Kasus Papa Minta Saham";
        kasus.sinopsis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vestibulum ipsum elit, eget tempor justo mollis vel.";
        kasusItemView.setOnItemClickListener(this);
        kasusItemView.setKasus(kasus);
        linearLayoutPilihan.addView(kasusItemView);

        AktorBerandaListItemView aktorItemView = AktorBerandaListItemView_.build(getActivity());
        Aktor aktor = new Aktor();
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.nama = "Muhammad Jesus Gautama";
        aktor.sinopsis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vestibulum ipsum elit, eget tempor justo mollis vel.";
        aktorItemView.setOnItemClickListener(this);
        aktorItemView.setAktor(aktor);
        linearLayoutPilihan.addView(aktorItemView);

        kasusItemView = KasusBerandaListItemView_.build(getActivity());
        kasus = new Kasus();
        kasus.nama = "Kasus Mama Minta Pulsa";
        kasus.sinopsis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vestibulum ipsum elit, eget tempor justo mollis vel. Nulla eget neque auctor purus rhoncus ornare in nec mauris. Sed in luctus risus. Donec id orci et eros fringilla tempor id non mi. Quisque id enim sed dui tincidunt lacinia non ac nibh.";
        kasusItemView.setOnItemClickListener(this);
        kasusItemView.setKasus(kasus);
        linearLayoutPilihan.addView(kasusItemView);
    }

    @Override
    public void onItemClick(Kasus kasus) {
        KasusDetailActivity_.intent(this).start();
    }

    @Override
    public void onItemClick(Aktor aktor) {
        AktorDetailActivity_.intent(this).start();
    }
}
