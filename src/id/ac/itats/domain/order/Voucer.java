package id.ac.itats.domain.order;

import id.ac.itats.domain.core.Produk;

public class Voucer {

    String nama;
    Produk produk;
    int nominal;

    public Voucer(String nama, Produk produk, int nominal) {
        this.nama = nama;
        this.produk = produk;
        this.nominal = nominal;
    }
}
