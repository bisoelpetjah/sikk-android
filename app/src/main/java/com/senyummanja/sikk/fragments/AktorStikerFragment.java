package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;

import com.senyummanja.sikk.R;
import com.senyummanja.sikk.views.StickerDialogView_;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;

/**
 * Created by irvan on 12/6/15.
 */
@EFragment(R.layout.fragment_aktor_stiker)
public class AktorStikerFragment extends Fragment {

    @Click(R.id.addSticker)
    protected void addStickerClicked() {
        new AlertDialog.Builder(getActivity())
                .setTitle(R.string.dialog_add_sticker)
                .setView(StickerDialogView_.build(getActivity()))
                .setNegativeButton(R.string.dialog_cancel, null)
                .show();
    }
}
