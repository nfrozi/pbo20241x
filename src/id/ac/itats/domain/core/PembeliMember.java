package id.ac.itats.domain.core;

public class PembeliMember extends Pembeli {

    private String kota;

    public PembeliMember(String nama, String kota) {
        this.setNama(nama);
        this.kota = kota;
    }

    public String getKota() {
        return kota;
    }

//    public boolean isMember() {
//        return true;
//    }
}
