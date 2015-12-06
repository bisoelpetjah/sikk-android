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

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EViewGroup(R.layout.layout_list_item_beranda_aktor)
public class AktorBerandaListItemView extends RelativeLayout {

    @ViewById(R.id.foto)
    protected ImageView imageViewFoto;

    @ViewById(R.id.nama)
    protected TextView textViewNama;

    @ViewById(R.id.sinopsis)
    protected TextView textViewSinopsis;

    private Aktor aktor;
    private OnItemClickListener onItemClickListener;

    public AktorBerandaListItemView(Context context) {
        super(context);
    }

    public AktorBerandaListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AktorBerandaListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Click(R.id.button)
    protected void itemClicked() {
        if (onItemClickListener != null) onItemClickListener.onItemClick(aktor);
    }

    public void setAktor(Aktor aktor) {
        this.aktor = aktor;

        if (aktor != null) {
            Glide.with(getContext())
                    .load(aktor.foto)
                    .asBitmap()
                    .centerCrop()
                    .into(RoundedDrawable.makeRoundedDrawableTarget(imageViewFoto));

            textViewNama.setText(aktor.nama);
            textViewSinopsis.setText(aktor.sinopsis);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(Aktor aktor);
    }
}
