package com.senyummanja.sikk.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by irvan on 12/5/15.
 */
public class Aktor implements Serializable {
    public String nama = "";
    public String foto = "";
    public String jabatan = "";
    public String nilai = "";
    public List<Kasus> kasusList = new ArrayList<>();
    public String sinopsis;
}
