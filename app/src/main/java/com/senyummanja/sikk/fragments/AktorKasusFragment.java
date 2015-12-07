package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.widget.LinearLayout;

import com.senyummanja.sikk.KasusDetailActivity_;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.interfaces.OnKasusItemClickListener;
import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.views.KasusListItemView;
import com.senyummanja.sikk.views.KasusListItemView_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_aktor_kasus)
public class AktorKasusFragment extends Fragment implements OnKasusItemClickListener {

    @ViewById(R.id.layout)
    protected LinearLayout linearLayout;

    @AfterViews
    protected void initViews() {
        performGetKasusList();
    }

    @Override
    public void onKasusItemClick(Kasus kasus) {
        KasusDetailActivity_.intent(this).start();
    }

    private void performGetKasusList() {
        for (int i = 1; i <= 8; i++) {
            Kasus kasus = new Kasus();
            kasus.nama = "Kasus Korupsi #" + i;
            kasus.time = "20";
            kasus.watch = 200 - (i * 10);
            kasus.aktor.nama = "Muhammad Jesus";

            KasusListItemView itemView = KasusListItemView_.build(getActivity());
            itemView.setOnKasusItemClickListener(this);
            itemView.setKasus(kasus);
            linearLayout.addView(itemView);
        }
    }
}
