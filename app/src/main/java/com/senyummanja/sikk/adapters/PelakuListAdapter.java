package com.senyummanja.sikk.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.senyummanja.sikk.models.Pelaku;
import com.senyummanja.sikk.views.PelakuListItemView;
import com.senyummanja.sikk.views.PelakuListItemView_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irvan on 12/5/15.
 */
public class PelakuListAdapter extends RecyclerView.Adapter<PelakuListAdapter.PelakuListViewHolder> {

    public List<Pelaku> pelakuList = new ArrayList<>();

    @Override
    public int getItemCount() {
        return pelakuList.size();
    }

    @Override
    public PelakuListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        PelakuListItemView itemView = PelakuListItemView_.build(parent.getContext());
        return new PelakuListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PelakuListViewHolder holder, int position) {
        holder.view.setPelaku(pelakuList.get(position));
    }

    public class PelakuListViewHolder extends RecyclerView.ViewHolder {

        public PelakuListItemView view;

        public PelakuListViewHolder(PelakuListItemView pelakuListItemView) {
            super(pelakuListItemView);
            view = pelakuListItemView;
        }
    }
}
