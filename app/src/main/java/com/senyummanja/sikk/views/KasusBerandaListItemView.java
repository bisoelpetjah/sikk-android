package com.senyummanja.sikk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.utils.RoundedDrawable;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/6/15.
 */
@EViewGroup(R.layout.layout_list_item_beranda_kasus)
public class KasusBerandaListItemView extends RelativeLayout {

    @ViewById(R.id.statusBadge)
    protected ImageView imageViewStatusBadge;

    @ViewById(R.id.namaKasus)
    protected TextView textViewNamaKasus;

    @ViewById(R.id.sinopsis)
    protected TextView textViewSinopsis;

    private Kasus kasus;
    private OnItemClickListener onItemClickListener;

    public KasusBerandaListItemView(Context context) {
        super(context);
    }

    public KasusBerandaListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public KasusBerandaListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Click(R.id.button)
    protected void itemClicked() {
        if (onItemClickListener != null) onItemClickListener.onItemClick(kasus);
    }

    public void setKasus(Kasus kasus) {
        this.kasus = kasus;

        if (kasus != null) {
            Glide.with(getContext())
                    .load(R.drawable.ic_logo)
                    .asBitmap()
                    .centerCrop()
                    .into(RoundedDrawable.makeRoundedDrawableTarget(imageViewStatusBadge));

            textViewNamaKasus.setText(kasus.nama);
            textViewSinopsis.setText(kasus.sinopsis);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(Kasus kasus);
    }
}
