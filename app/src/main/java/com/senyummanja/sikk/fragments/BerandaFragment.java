package com.senyummanja.sikk.fragments;

import android.support.v4.app.Fragment;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.senyummanja.sikk.AktorDetailActivity_;
import com.senyummanja.sikk.KasusDetailActivity_;
import com.senyummanja.sikk.R;
import com.senyummanja.sikk.interfaces.OnAktorItemClickListener;
import com.senyummanja.sikk.interfaces.OnKasusItemClickListener;
import com.senyummanja.sikk.models.Aktor;
import com.senyummanja.sikk.models.Kasus;
import com.senyummanja.sikk.views.AktorBerandaListItemView;
import com.senyummanja.sikk.views.AktorBerandaListItemView_;
import com.senyummanja.sikk.views.AktorListItemView;
import com.senyummanja.sikk.views.AktorListItemView_;
import com.senyummanja.sikk.views.KasusBerandaListItemView;
import com.senyummanja.sikk.views.KasusBerandaListItemView_;
import com.senyummanja.sikk.views.KasusListItemView;
import com.senyummanja.sikk.views.KasusListItemView_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/5/15.
 */
@EFragment(R.layout.fragment_beranda)
public class BerandaFragment extends Fragment implements OnKasusItemClickListener, OnAktorItemClickListener {

    @ViewById(R.id.pilihan)
    protected LinearLayout linearLayoutPilihan;

    @ViewById(R.id.kasus)
    protected LinearLayout linearLayoutKasus;

    @ViewById(R.id.aktor)
    protected LinearLayout linearLayoutAktor;

    @ViewById(R.id.trivia)
    protected TextView textViewTrivia;

    @AfterViews
    protected void initViews() {
        KasusBerandaListItemView kasusBerandaItemView = KasusBerandaListItemView_.build(getActivity());
        Kasus kasus = new Kasus();
        kasus.nama = "Papi Ingin Saham";
        kasus.sinopsis = "Kehadiran Ketua DPR RI Setya Novanto sangat dinanti untuk menyelesaikan dugaan pelanggaran etik yang ada dalam rekaman terkait permintaan saham kepada PT Freeport Indonesia.";
        kasus.time = "3 hari";
        kasus.watch = 1452;
        kasus.aktor.nama = "Setya Novanto";
        kasus.aktor.foto = "http://fajar.co.id/wp-content/uploads/2015/07/Setya-Novanto.jpg";
        kasus.aktor.jabatan = "Ketua DPR RI";
        kasus.aktor.nilai = "?";
        kasus.aktor.kasusList.add(kasus);
        kasus.progress = 2;
        kasusBerandaItemView.setOnKasusItemClickListener(this);
        kasusBerandaItemView.setKasus(kasus);
        linearLayoutPilihan.addView(kasusBerandaItemView);

        AktorBerandaListItemView aktorBerandaItemView = AktorBerandaListItemView_.build(getActivity());
        Aktor aktor = new Aktor();
        aktor.nama = "Setya Novanto";
        aktor.sinopsis = "Setya Novanto: saya sudah bertemu dengan presiden beberapa waktu lalu, selain presiden saya juga bertemu dengan pimpinan Negara lainnya. Beberapa pimpinan yang saat itu ketemu adalah Ketua MA, Ketua KY serta Ketua MK.";
        aktor.foto = "http://fajar.co.id/wp-content/uploads/2015/07/Setya-Novanto.jpg";
        aktor.jabatan = "Ketua DPR RI";
        aktor.nilai = "?";
        kasus = new Kasus();
        kasus.nama = "Papi Ingin Saham";
        kasus.time = "3 hari";
        kasus.watch = 1452;
        kasus.aktor = aktor;
        kasus.progress = 2;
        aktor.kasusList.add(kasus);
        aktorBerandaItemView.setOnAktorItemClickListener(this);
        aktorBerandaItemView.setAktor(aktor);
        linearLayoutPilihan.addView(aktorBerandaItemView);

        kasusBerandaItemView = KasusBerandaListItemView_.build(getActivity());
        kasus = new Kasus();
        kasus.nama = "Korupsi Dana Hibah";
        kasus.sinopsis = "Kejaksaan Negeri (Kejari) Serang menahan tersangka kasus dugaan korupsi dana hibah senilai Rp 2 miliar dari Pemerintah Provinsi Banten tahun anggaran 2013, yakni A Faisal Taufik, Ketua Yayasan Banten Muda Indonesia";
        kasus.time = "1 hari";
        kasus.watch = 512;
        kasus.aktor.nama = "Faisal Taufik";
        kasus.aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        kasus.aktor.jabatan = "Mantan Bupati Lebak";
        kasus.aktor.nilai = "Rp2.000.000.000,00";
        kasus.aktor.kasusList.add(kasus);
        kasus.progress = 1;
        kasusBerandaItemView.setOnKasusItemClickListener(this);
        kasusBerandaItemView.setKasus(kasus);
        linearLayoutPilihan.addView(kasusBerandaItemView);

        kasusBerandaItemView = KasusBerandaListItemView_.build(getActivity());
        kasus = new Kasus();
        kasus.nama = "Papi Ingin Saham";
        kasus.time = "3 hari";
        kasus.watch = 1452;
        kasus.aktor.nama = "Setya Novanto";
        kasus.aktor.foto = "http://www.differencebetween.info/sites/default/files/images_articles_d7_1/muhammad.jpg";
        kasus.aktor.jabatan = "Ketua DPR RI";
        kasus.aktor.nilai = "?";
        kasus.aktor.kasusList.add(kasus);
        kasus.progress = 2;
        kasusBerandaItemView.setOnKasusItemClickListener(this);
        kasusBerandaItemView.setKasus(kasus);
        linearLayoutKasus.addView(kasusBerandaItemView);

        aktorBerandaItemView = AktorBerandaListItemView_.build(getActivity());
        aktor = new Aktor();
        aktor.nama = "Setya Novanto";
        aktor.foto = "http://fajar.co.id/wp-content/uploads/2015/07/Setya-Novanto.jpg";
        aktor.jabatan = "Ketua DPR RI";
        aktor.nilai = "?";
        kasus = new Kasus();
        kasus.nama = "Papi Ingin Saham";
        kasus.time = "3 hari";
        kasus.watch = 1452;
        kasus.aktor = aktor;
        kasus.progress = 2;
        aktor.kasusList.add(kasus);
        aktor.kasusList.add(kasus);
        aktorBerandaItemView.setOnAktorItemClickListener(this);
        aktorBerandaItemView.setAktor(aktor);
        linearLayoutAktor.addView(aktorBerandaItemView);

        textViewTrivia.setText("Dari 50 kasus yang diselidiki KPK hanya 24 kasus yang disidik dan hanya 9 kasus yang masuk pengadilan.");
    }

    @Override
    public void onKasusItemClick(Kasus kasus) {
        KasusDetailActivity_.intent(this).kasus(kasus).start();
    }

    @Override
    public void onAktorItemClick(Aktor aktor) {
        AktorDetailActivity_.intent(this).aktor(aktor).start();
    }
}
