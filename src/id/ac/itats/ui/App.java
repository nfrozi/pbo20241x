package id.ac.itats.ui;

import id.ac.itats.domain.core.Pembeli;
import id.ac.itats.domain.core.PembeliMember;
import id.ac.itats.domain.core.Produk;
import id.ac.itats.domain.core.ProdukDigital;
import id.ac.itats.domain.order.ResiKasir;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {

    public static void main(String[] args) {
        Produk validTehJavana = new Produk(
                "Teh Javana 350",
                3000,
                "PT Sayap Mas"
        );

        Pembeli yahya = new Pembeli();
        PembeliMember bayu = new PembeliMember(
            "Bayu",
            "Surabaya"
        );

        List<Pembeli> listPembeli = new ArrayList<>();
        listPembeli.add(yahya);
        listPembeli.add(bayu);

        System.out.println(yahya.isMember());
        System.out.println(bayu.isMember());

        Produk digital = new ProdukDigital("Voucer Google Play", 50000, "Google");
        ResiKasir resi = new ResiKasir(bayu);
        resi.tambahProduk(validTehJavana);
        resi.tambahProduk(digital);
        resi.cetakListProduk();

        List<Produk> listProduk = new LinkedList<>();
        listProduk.add(validTehJavana);
        listProduk.add(digital);

        resi.tambahSemuaProduk(listProduk);
        resi.cetakListProduk();

        System.out.println(resi.getPembeli());




//
//        System.out.println("Menampilkan objek produk yang valid:");
//        System.out.println(validTehJavana.getNama() + " / " +
//                validTehJavana.getHarga() + "\n");
//
//        id.ac.itats.domain.core.Produk invalidTehJavana = new id.ac.itats.domain.core.Produk(
//            "",
//            200,
//            "PT Sayap Mas"
//        );
//
//        System.out.println("Menampilkan objek produk yang tidak valid?");
//        System.out.println(invalidTehJavana.getNama() + " / " +
//            invalidTehJavana.getHarga());



//        id.ac.itats.domain.order.Voucer vJvn = new id.ac.itats.domain.order.Voucer(
//            "VC Javanatehmlti",
//            tehJavana,
//            2200
//        );

//        id.ac.itats.domain.core.Pembeli agus = new id.ac.itats.domain.core.Pembeli();
//        System.out.println(agus.getNama());
//
//        id.ac.itats.domain.core.PembeliMember budi = new id.ac.itats.domain.core.PembeliMember(
//            "Budi",
//            "Surabaya"
//        );
//
////        System.out.println(budi.getNama() + ", " + budi.getKota());
//
//        System.out.println(agus.getNama() + ", member = " + agus.isMember());
//        System.out.println(budi.getNama() + ", member = " + budi.isMember());
//
//        if (budi.isMember()) {
//            System.out.println(budi.getNama() + " mendapat diskon 10%.");
//        }
//
//        if (agus.isMember()) {
//            System.out.println(agus.getNama() + " mendapat diskon 10%.");
//        } else {
//            System.out.println(budi.getNama() + " tidak dapat diskon.");
//        }
    }
}