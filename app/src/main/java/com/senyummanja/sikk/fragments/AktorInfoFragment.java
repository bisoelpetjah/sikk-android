package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import com.senyummanja.sikk.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/6/15.
 */
@EFragment(R.layout.fragment_aktor_info)
public class AktorInfoFragment extends Fragment {

    private static final String FRAGMENT_ARG_JABATAN = "jabatan";

    @ViewById(R.id.jabatan)
    protected TextView textViewJabatan;

    @FragmentArg(FRAGMENT_ARG_JABATAN)
    protected String jabatan;

    @AfterViews
    protected void initViews() {
        if (jabatan != null) {
            textViewJabatan.setText(jabatan);
        }
    }
}
