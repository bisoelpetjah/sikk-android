package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;

import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.senyummanja.sikk.AktorDetailActivity_;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.adapters.AktorListAdapter;
import com.senyummanja.sikk.interfaces.OnAktorItemClickListener;
import com.senyummanja.sikk.models.Aktor;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_aktor)
public class AktorFragment extends Fragment implements OnAktorItemClickListener {

    @ViewById(R.id.aktorList)
    protected SuperRecyclerView recyclerViewAktor;

    private AktorListAdapter adapter = new AktorListAdapter();

    @AfterViews
    protected void initViews() {
        adapter.setOnAktorItemClickListener(this);

        recyclerViewAktor.setAdapter(adapter);
        recyclerViewAktor.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        performGetAktorList();
    }

    @Override
    public void onAktorItemClick(Aktor aktor) {
        AktorDetailActivity_.intent(this).start();
    }

    private void performGetAktorList() {
        for (int i = 1; i <= 20; i++) {
            Aktor aktor = new Aktor();
            aktor.nama = "Muhammad Jesus";
            aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
            aktor.jabatan = "Direktur Korupsi #" + i;
            aktor.nilai = 9000000000000l - (i * 1000000);
            adapter.aktorList.add(aktor);
        }
    }
}
