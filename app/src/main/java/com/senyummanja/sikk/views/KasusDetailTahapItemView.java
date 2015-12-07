package com.senyummanja.sikk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.senyummanja.sikk.R;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/7/15.
 */
@EViewGroup(R.layout.layout_kasus_detail_tahap)
public class KasusDetailTahapItemView extends RelativeLayout {

    @ViewById(R.id.namaTahap)
    protected TextView textViewNamaTahap;

    @ViewById(R.id.keterangan)
    protected TextView textViewKeterangan;

    public KasusDetailTahapItemView(Context context) {
        super(context);
    }

    public KasusDetailTahapItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public KasusDetailTahapItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setProgress(int progress) {
        switch (progress) {
            case 1: {
                textViewNamaTahap.setText("Penetapan");
                textViewKeterangan.setText("Hakim dan penuntut telah ditetapkan pada kasus ini, yaitu Hakim A dan Penuntut B. Selanjutnya akan dilaksanakan proses putusan.");
                break;
            }
            case 2: {
                textViewNamaTahap.setText("Putusan");
                textViewKeterangan.setText("Keputusan telah ditetapkan bahwa tersangka akan dikenakan hukuman. Selanjutnya akan dilaksanakan proses kasasi (bila ada).");
                break;
            }
            case 3: {
                textViewNamaTahap.setText("Kasasi");
                textViewKeterangan.setText("Kasasi telah dilakukan dan tengah menunggu putusan kasasi.");
                break;
            }
            case 4: {
                textViewNamaTahap.setText("Putusan Kasasi");
                textViewKeterangan.setText("Telah diputuskan bahwa tersangka dikenakan hukuman yakni kurungan selama 10 tahun dan denda sebesar 1 milyar rupiah.");
                break;
            }
        }
    }
}
