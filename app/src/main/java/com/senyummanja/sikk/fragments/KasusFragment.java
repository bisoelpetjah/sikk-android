package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;

import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.senyummanja.sikk.KasusDetailActivity_;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.adapters.KasusListAdapter;
import com.senyummanja.sikk.interfaces.OnKasusItemClickListener;
import com.senyummanja.sikk.models.Kasus;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_kasus)
public class KasusFragment extends Fragment implements OnKasusItemClickListener {

    @ViewById(R.id.kasusList)
    protected SuperRecyclerView recyclerViewKasus;

    private KasusListAdapter adapter = new KasusListAdapter();

    @AfterViews
    protected void initViews() {
        adapter.setOnKasusItemClickListener(this);

        recyclerViewKasus.setAdapter(adapter);
        recyclerViewKasus.setLayoutManager(new LinearLayoutManager(getActivity()));

        performGetKasusList();
    }

    @Override
    public void onKasusItemClick(Kasus kasus) {
        KasusDetailActivity_.intent(this).start();
    }

    private void performGetKasusList() {
        Kasus kasus = new Kasus();
        kasus.nama = "Papi Ingin Saham";
        kasus.time = "3 hari";
        kasus.watch = 1452;
        kasus.aktor.nama = "Setya Novanto";
        kasus.progress = 2;
        adapter.kasusList.add(kasus);

        kasus = new Kasus();
        kasus.nama = "Korupsi Pengentasan K2I Pemprov Riau";
        kasus.time = "1 hari";
        kasus.watch = 312;
        kasus.aktor.nama = "Susilo";
        kasus.progress = 4;
        adapter.kasusList.add(kasus);

        kasus = new Kasus();
        kasus.nama = "Suap Penerbitan Izin Usaha Lembaga Kliring Berjangka";
        kasus.time = "1 hari";
        kasus.watch = 225;
        kasus.aktor.nama = "Mohammad Bihar Sakti Wibowo";
        kasus.progress = 3;
        adapter.kasusList.add(kasus);

        kasus = new Kasus();
        kasus.nama = "Korupsi Penggunaan Dana Jamkesmas";
        kasus.time = "1 hari";
        kasus.watch = 275;
        kasus.aktor.nama = "Mulyadi Jayabaya";
        kasus.progress = 4;
        adapter.kasusList.add(kasus);

        kasus = new Kasus();
        kasus.nama = "Korupsi Dana Hibah";
        kasus.time = "1 hari";
        kasus.watch = 512;
        kasus.aktor.nama = "Faisal Taufik";
        kasus.progress = 1;
        adapter.kasusList.add(kasus);

        kasus = new Kasus();
        kasus.nama = "Korupsi Pengadaan Lahan Untuk Asrama Haji Riau";
        kasus.time = "1 hari";
        kasus.watch = 411;
        kasus.aktor.nama = "Muhammad Guntur";
        kasus.progress = 4;
        adapter.kasusList.add(kasus);

        kasus = new Kasus();
        kasus.nama = "Korupsi Pembayaran Honor Tim Pembina";
        kasus.time = "1 hari";
        kasus.watch = 912;
        kasus.aktor.nama = "Junaidi Hamsyah";
        kasus.progress = 4;
        adapter.kasusList.add(kasus);

        kasus = new Kasus();
        kasus.nama = "Suap dari PT Media Karya Sentosa";
        kasus.time = "1 hari";
        kasus.watch = 135;
        kasus.aktor.nama = "JFuad Amin";
        kasus.progress = 4;
        adapter.kasusList.add(kasus);

        adapter.notifyDataSetChanged();
    }
}
