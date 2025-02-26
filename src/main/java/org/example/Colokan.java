package org.example;

public abstract class Colokan {
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public int getHarga() {
        return harga;
    }

    public Colokan(String merk, double promisedBandwidth, int harga) {
        this.merk = merk;
        this.promisedBandwidth = promisedBandwidth;
        this.harga = harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    private String merk;
    private double promisedBandwidth;
    private int harga;

    public  abstract  double getRealBandwidth();
}
