package id.ac.itats.domain.core;

public class Produk {

    // Property bantuan (helper)
    private ProdukValidation validation;

    // Property inti objek
    private String nama;
    private int harga;
    private String produsen;

    public Produk(String nama, int harga, String produsen) {
        validation = new ProdukValidation(nama, harga);
        validation.validate();

        // Instansiasi tidak akan berjalan ketika validasi gagal
        this.nama = nama;
        this.harga = harga;
        this.produsen = produsen;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getProdusen() {
        return produsen;
    }
}
