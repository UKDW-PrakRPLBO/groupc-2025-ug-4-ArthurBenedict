package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

    public int getResolution() {
        double realBandwidth = colokan.getRealBandwidth();
        int resolution;

        if (realBandwidth < 35) {
            resolution = 480;
        } else if (realBandwidth < 100) {
            resolution = 720;
        } else {
            resolution = 1080;
        }

        return Math.min(resolution, maxResolusi);
    }
}
