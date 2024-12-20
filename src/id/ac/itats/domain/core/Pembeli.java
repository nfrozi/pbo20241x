package id.ac.itats.domain.core;

public class Pembeli {

    private String nama;

    public Pembeli() {
        this.nama = "Umum";
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public boolean isMember() {
//        return false;

        if (this instanceof PembeliMember) {
            return true;
        } else {
            return false;
        }
    }
}
