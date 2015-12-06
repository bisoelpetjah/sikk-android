package com.senyummanja.sikk.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.views.KasusListItemView;
import com.senyummanja.sikk.views.KasusListItemView_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irvan on 12/5/15.
 */
public class KasusListAdapter extends RecyclerView.Adapter<KasusListAdapter.KasusListViewHolder> {

    public List<Kasus> kasusList = new ArrayList<>();

    private KasusListItemView.OnItemClickListener onItemClickListener;

    @Override
    public int getItemCount() {
        return kasusList.size();
    }

    @Override
    public KasusListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        KasusListItemView itemView = KasusListItemView_.build(parent.getContext());
        itemView.setOnItemClickListener(onItemClickListener);
        return new KasusListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(KasusListViewHolder holder, int position) {
        holder.view.setKasus(kasusList.get(position));
    }

    public void setOnItemClickListener(KasusListItemView.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public class KasusListViewHolder extends RecyclerView.ViewHolder {

        public KasusListItemView view;

        public KasusListViewHolder(KasusListItemView kasusListItemView) {
            super(kasusListItemView);
            view = kasusListItemView;
        }
    }
}
