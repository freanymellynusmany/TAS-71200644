package com.rplbo.uasprojectpos;

public class Barang {
    private static int nextNum = 0;
    private String nama;
    private long harga;
    private String kode;
    private int stok;

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }
    public Barang(String nama, int stok, long harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
        if(this.nama.startsWith("Keyboard")){
            nextNum += 1;
            this.setKode("KB00"+nextNum);
        }
        else if(this.nama.startsWith("Mouse")){
            nextNum += 1;
            this.setKode("MS00"+nextNum);
        }
        else if(this.nama.startsWith("Headset")){
            nextNum += 1;
            this.setKode("HS00"+nextNum);
        }
    }

    public String getNama() {
        return nama;
    }
    public int getStok() {
        return stok;
    }



    public long getHarga() {
        return harga;
    }
}

