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
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_aktor_kasus)
public class AktorKasusFragment extends Fragment implements OnKasusItemClickListener {

    private static final String FRAGMENT_ARG_KASUS_LIST = "kasus_list";

    @ViewById(R.id.layout)
    protected LinearLayout linearLayout;

    @FragmentArg(FRAGMENT_ARG_KASUS_LIST)
    protected ArrayList<Kasus> kasusList;

    @AfterViews
    protected void initViews() {
        if (kasusList != null) {
            for (Kasus kasus : kasusList) {
                KasusListItemView itemView = KasusListItemView_.build(getContext());
                itemView.setOnKasusItemClickListener(this);
                itemView.setKasus(kasus);
                linearLayout.addView(itemView);
            }
        }
    }

    @Override
    public void onKasusItemClick(Kasus kasus) {
        KasusDetailActivity_.intent(this).start();
    }
}
