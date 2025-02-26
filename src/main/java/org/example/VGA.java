package org.example;

public class VGA extends Colokan {
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(merk, promisedBandwidth, harga);
    }

    @Override
    public double getRealBandwidth() {
        int hargaBiasa = 30000;
        int harga = super.getHarga();
        double ratio = harga / (double) hargaBiasa > 1?1:harga / (double) hargaBiasa;
        return super.getPromisedBandwidth() * ratio;
    }
}
