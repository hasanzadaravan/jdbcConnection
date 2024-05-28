package org.example.model;

public class User {
    String ad;
    String soyad;
    String fin;
    String maas;

    @Override
    public String toString() {
        return "User{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", fin='" + fin + '\'' +
                ", maas='" + maas + '\'' +
                '}';
    }

    public User(String ad, String soyad, String fin, String maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.fin = fin;
        this.maas = maas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }
}
