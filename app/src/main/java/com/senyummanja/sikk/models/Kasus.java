package com.senyummanja.sikk.models;

import java.io.Serializable;

/**
 * Created by irvan on 12/5/15.
 */
public class Kasus implements Serializable {
    public String nama = "";
    public Aktor aktor = new Aktor();
    public int watch = 0;
    public String time = "";
    public int progress = 0;
    public String sinopsis = "";
}
