package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;

import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.senyummanja.sikk.AktorDetailActivity_;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.adapters.AktorListAdapter;
import com.senyummanja.sikk.interfaces.OnAktorItemClickListener;
import com.senyummanja.sikk.models.Aktor;
import com.senyummanja.sikk.models.Kasus;

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
        AktorDetailActivity_.intent(this).aktor(aktor).start();
    }

    private void performGetAktorList() {
        Aktor aktor = new Aktor();
        aktor.nama = "Setya Novanto";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Ketua DPR RI";
        aktor.nilai = "?";
        Kasus kasus = new Kasus();
        kasus.nama = "Papi Ingin Saham";
        kasus.time = "3 hari";
        kasus.watch = 1452;
        kasus.aktor = aktor;
        kasus.progress = 2;
        aktor.kasusList.add(kasus);
        adapter.aktorList.add(aktor);

        aktor = new Aktor();
        aktor.nama = "Susilo";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Mantan Kadisbun Riau";
        aktor.nilai = "Rp38.000.000.000,00";
        kasus = new Kasus();
        kasus.nama = "Korupsi Pengentasan K2I Pemprov Riau";
        kasus.time = "1 hari";
        kasus.watch = 312;
        kasus.aktor = aktor;
        kasus.progress = 4;
        aktor.kasusList.add(kasus);
        adapter.aktorList.add(aktor);

        aktor = new Aktor();
        aktor.nama = "Mohammad Bihar Sakti Wibowo";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Mantan Direktur PT Bursa Berjangka Jakarta";
        aktor.nilai = "?";
        kasus = new Kasus();
        kasus.nama = "Suap Penerbitan Izin Usaha Lembaga Kliring Berjangka";
        kasus.time = "1 hari";
        kasus.watch = 225;
        kasus.aktor = aktor;
        kasus.progress = 3;
        aktor.kasusList.add(kasus);
        adapter.aktorList.add(aktor);

        aktor = new Aktor();
        aktor.nama = "Mulyadi Jayabaya";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Mantan Bupati Lebak";
        aktor.nilai = "Rp25.000.000.000,00";
        kasus = new Kasus();
        kasus.nama = "Korupsi Penggunaan Dana Jamkesmas";
        kasus.time = "1 hari";
        kasus.watch = 275;
        kasus.aktor = aktor;
        kasus.progress = 4;
        aktor.kasusList.add(kasus);
        adapter.aktorList.add(aktor);

        aktor = new Aktor();
        aktor.nama = "Faisal Taufik";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Ketua Yayasan Lembaga Banten Muda Indonesia";
        aktor.nilai = "Rp2.000.000.000,00";
        kasus = new Kasus();
        kasus.nama = "Korupsi Dana Hibah";
        kasus.time = "1 hari";
        kasus.watch = 512;
        kasus.aktor = aktor;
        kasus.progress = 1;
        aktor.kasusList.add(kasus);
        adapter.aktorList.add(aktor);

        aktor = new Aktor();
        aktor.nama = "Muhammad Guntur";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Mantan Kepala Badan Kepegawaian Daerah";
        aktor.nilai = "Rp17.958.525.000,00";
        kasus = new Kasus();
        kasus.nama = "Korupsi Pengadaan Lahan Untuk Asrama Haji Riau";
        kasus.time = "1 hari";
        kasus.watch = 411;
        kasus.aktor = aktor;
        kasus.progress = 4;
        aktor.kasusList.add(kasus);
        adapter.aktorList.add(aktor);

        aktor = new Aktor();
        aktor.nama = "Junaidi Hamsyah";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "Gubernur Bengkulu";
        aktor.nilai = "Rp5.000.000.000,00";
        kasus = new Kasus();
        kasus.nama = "Korupsi Pembayaran Honor Tim Pembina";
        kasus.time = "1 hari";
        kasus.watch = 912;
        kasus.aktor = aktor;
        kasus.progress = 4;
        aktor.kasusList.add(kasus);
        adapter.aktorList.add(aktor);

        aktor = new Aktor();
        aktor.nama = "Fuad Amin";
        aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        aktor.jabatan = "";
        aktor.nilai = "Rp18.050.000.000,00";
        kasus = new Kasus();
        kasus.nama = "Suap dari PT Media Karya Sentosa";
        kasus.time = "1 hari";
        kasus.watch = 135;
        kasus.aktor = aktor;
        kasus.progress = 4;
        aktor.kasusList.add(kasus);
        adapter.aktorList.add(aktor);

        adapter.notifyDataSetChanged();
    }
}
