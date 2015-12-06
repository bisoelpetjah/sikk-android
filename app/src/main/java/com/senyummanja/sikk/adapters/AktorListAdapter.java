package com.senyummanja.sikk.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.senyummanja.sikk.interfaces.OnAktorItemClickListener;
import com.senyummanja.sikk.models.Aktor;
import com.senyummanja.sikk.views.AktorListItemView;
import com.senyummanja.sikk.views.AktorListItemView_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irvan on 12/5/15.
 */
public class AktorListAdapter extends RecyclerView.Adapter<AktorListAdapter.AktorListViewHolder> {

    public List<Aktor> aktorList = new ArrayList<>();

    private OnAktorItemClickListener onAktorItemClickListener;

    @Override
    public int getItemCount() {
        return aktorList.size();
    }

    @Override
    public AktorListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AktorListItemView itemView = AktorListItemView_.build(parent.getContext());
        itemView.setOnAktorItemClickListener(onAktorItemClickListener);
        return new AktorListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AktorListViewHolder holder, int position) {
        holder.view.setAktor(aktorList.get(position));
    }

    public void setOnAktorItemClickListener(OnAktorItemClickListener onAktorItemClickListener) {
        this.onAktorItemClickListener = onAktorItemClickListener;
    }

    public class AktorListViewHolder extends RecyclerView.ViewHolder {

        public AktorListItemView view;

        public AktorListViewHolder(AktorListItemView aktorListItemView) {
            super(aktorListItemView);
            view = aktorListItemView;
        }
    }
}
