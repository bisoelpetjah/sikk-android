package com.senyummanja.sikk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.senyummanja.sikk.R;

import org.androidannotations.annotations.EViewGroup;

/**
 * Created by irvan on 12/6/15.
 */
@EViewGroup(R.layout.layout_dialog_sticker)
public class StickerDialogView extends RelativeLayout {
    public StickerDialogView(Context context) {
        super(context);
    }

    public StickerDialogView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StickerDialogView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
