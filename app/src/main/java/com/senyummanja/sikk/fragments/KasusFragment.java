package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;

import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.senyummanja.sikk.KasusDetailActivity_;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.adapters.KasusListAdapter;
import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.models.Pelaku;
import com.senyummanja.sikk.views.KasusListItemView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_kasus)
public class KasusFragment extends Fragment implements KasusListItemView.OnItemClickListener {

    @ViewById(R.id.kasusList)
    protected SuperRecyclerView recyclerViewKasus;

    private KasusListAdapter adapter = new KasusListAdapter();

    @AfterViews
    protected void initViews() {
        adapter.setOnItemClickListener(this);

        recyclerViewKasus.setAdapter(adapter);
        recyclerViewKasus.setLayoutManager(new LinearLayoutManager(getActivity()));

        performGetKasusList();
    }

    @Override
    public void onItemClick(Kasus kasus) {
        KasusDetailActivity_.intent(this).start();
    }

    private void performGetKasusList() {
        for (int i = 1; i <= 20; i++) {
            Kasus kasus = new Kasus();
            kasus.nama = "Kasus Korupsi #" + i;
            kasus.time = 20 - i;
            kasus.watch = 200 - (i * 10);
            List<Pelaku> pelakuList = new ArrayList<>();
            for (int j = 1; j <= (i % 4) + 1; j++) {
                Pelaku pelaku = new Pelaku();
                pelaku.nama = "Pelaku #" + j;
                pelakuList.add(pelaku);
            }
            kasus.pelakuList = pelakuList;
            adapter.kasusList.add(kasus);
        }
        adapter.notifyDataSetChanged();
    }
}
