package com.senyummanja.sikk.utils;

import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;

import com.bumptech.glide.request.target.BitmapImageViewTarget;

/**
 * Created by irvan on 12/5/15.
 */
public class RoundedDrawable {
    public static BitmapImageViewTarget makeRoundedDrawableTarget(final ImageView imageView) {
        return new BitmapImageViewTarget(imageView) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable bitmapDrawable = RoundedBitmapDrawableFactory.create(imageView.getContext().getResources(), resource);
                bitmapDrawable.setCircular(true);
                imageView.setImageDrawable(bitmapDrawable);
            }
        };
    }
}
