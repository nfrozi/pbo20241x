public class Produk {

    private String nama;
    private int harga;
    private String produsen;

    public Produk(String nama, int harga, String produsen) {
        this.nama = isNamaValid(nama) ? nama : null;
        this.harga = isHargaValid(harga) ? harga : null;
        this.produsen = produsen;
    }

    public int getHarga() {
        return harga;
    }

    // Validasi
    private boolean isHargaValid(int harga) {
        if (harga < 500) {
            System.err.println("Harga harus > 500!");
            return false;
        } else {
            return true;
        }
    }

    private boolean isNamaValid(String nama) {
        if (nama == "") {
            System.err.println("Nama harus ada isinya!");
            return false;
        } else {
            return true;
        }
    }
}
