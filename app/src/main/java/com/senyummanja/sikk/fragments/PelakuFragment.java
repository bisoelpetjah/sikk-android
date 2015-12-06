package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;

import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.adapters.PelakuListAdapter;
import com.senyummanja.sikk.models.Pelaku;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_pelaku)
public class PelakuFragment extends Fragment {

    @ViewById(R.id.pelakuList)
    protected SuperRecyclerView recyclerViewPelaku;

    private PelakuListAdapter adapter = new PelakuListAdapter();

    @AfterViews
    protected void initViews() {
        recyclerViewPelaku.setAdapter(adapter);
        recyclerViewPelaku.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        performGetPelakuList();
    }

    private void performGetPelakuList() {
        for (int i = 1; i <= 20; i++) {
            Pelaku pelaku = new Pelaku();
            pelaku.nama = "Muhammad Jesus";
            pelaku.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
            pelaku.jabatan = "Direktur Korupsi #" + i;
            pelaku.nilai = 9000000000000l - (i * 1000000);
            adapter.pelakuList.add(pelaku);
        }
    }
}
