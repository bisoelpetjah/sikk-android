package com.senyummanja.sikk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.models.Pelaku;
import com.senyummanja.sikk.utils.RoundedDrawable;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EViewGroup(R.layout.layout_list_item_kasus)
public class KasusListItemView extends RelativeLayout {

    @ViewById(R.id.statusBadge)
    protected ImageView imageViewStatusBadge;

    @ViewById(R.id.namaKasus)
    protected TextView textViewNamaKasus;

    @ViewById(R.id.pelaku)
    protected TextView textViewPelaku;

    @ViewById(R.id.watch)
    protected TextView textViewWatch;

    @ViewById(R.id.waktu)
    protected TextView textViewWaktu;

    public KasusListItemView(Context context) {
        super(context);
    }

    public KasusListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public KasusListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setKasus(Kasus kasus) {
        if (kasus != null) {
            Glide.with(getContext())
                    .load(R.drawable.ic_logo)
                    .asBitmap()
                    .centerCrop()
                    .into(RoundedDrawable.makeRoundedDrawableTarget(imageViewStatusBadge));

            textViewNamaKasus.setText(kasus.nama);
            textViewWatch.setText("" + kasus.watch);
            textViewWaktu.setText(kasus.time + " menit");

            StringBuilder builder = new StringBuilder();
            for (Pelaku pelaku : kasus.pelakuList) {
                builder.append(pelaku.nama);
                builder.append(", ");
            }
            if (!kasus.pelakuList.isEmpty()) {
                builder.delete(builder.length() - 2, builder.length() - 1);
            }
            textViewPelaku.setText(builder.toString());
        }
    }
}
