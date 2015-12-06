package com.senyummanja.sikk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.interfaces.OnAktorItemClickListener;
import com.senyummanja.sikk.models.Aktor;
import com.senyummanja.sikk.utils.RoundedDrawable;

import org.androidannotations.annotations.Click;
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

    private Aktor aktor;
    private OnAktorItemClickListener onAktorItemClickListener;

    public AktorListItemView(Context context) {
        super(context);
    }

    public AktorListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AktorListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Click(R.id.button)
    protected void itemClicked() {
        if (onAktorItemClickListener != null) onAktorItemClickListener.onAktorItemClick(aktor);
    }

    public void setAktor(Aktor aktor) {
        this.aktor = aktor;

        if (aktor != null) {
            Glide.with(getContext())
                    .load(aktor.foto)
                    .asBitmap()
                    .centerCrop()
                    .into(RoundedDrawable.makeRoundedDrawableTarget(imageViewFoto));

            textViewNilai.setText(aktor.nilai);
            textViewNama.setText(aktor.nama);
            textViewJabatan.setText(aktor.jabatan);
        }
    }

    public void setOnAktorItemClickListener(OnAktorItemClickListener onAktorItemClickListener) {
        this.onAktorItemClickListener = onAktorItemClickListener;
    }
}
