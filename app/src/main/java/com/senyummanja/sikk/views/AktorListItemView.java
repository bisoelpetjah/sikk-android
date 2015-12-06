package com.senyummanja.sikk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.models.Aktor;
import com.senyummanja.sikk.utils.RoundedDrawable;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EViewGroup(R.layout.layout_list_item_aktor)
public class AktorListItemView extends RelativeLayout {

    @ViewById(R.id.nilai)
    protected TextView textViewNilai;

    @ViewById(R.id.foto)
    protected ImageView imageViewFoto;

    @ViewById(R.id.nama)
    protected TextView textViewNama;

    @ViewById(R.id.jabatan)
    protected TextView textViewJabatan;

    public AktorListItemView(Context context) {
        super(context);
    }

    public AktorListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AktorListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setPelaku(Aktor aktor) {
        if (aktor != null) {
            Glide.with(getContext())
                    .load(aktor.foto)
                    .asBitmap()
                    .centerCrop()
                    .into(RoundedDrawable.makeRoundedDrawableTarget(imageViewFoto));

            textViewNilai.setText("Rp" + aktor.nilai + ",00");
            textViewNama.setText(aktor.nama);
            textViewJabatan.setText(aktor.jabatan);
        }
    }
}
