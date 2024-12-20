package id.ac.itats.domain.order;

import id.ac.itats.domain.core.Pembeli;
import id.ac.itats.domain.core.Produk;

import java.util.ArrayList;
import java.util.List;

public class ResiKasir {

    private Pembeli pembeli;
    private List<Produk> listProduk;

    public ResiKasir(Pembeli pembeli) {
        this.pembeli = pembeli;
        this.listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public void tambahSemuaProduk(List<Produk> listProduk) {
        this.listProduk = listProduk;
    }

    public void cetakListProduk() {
        for (Produk produk : listProduk) {
            System.out.println(produk.getNama());
        }
    }
    public Pembeli getPembeli() {
        return pembeli;
    }
}
