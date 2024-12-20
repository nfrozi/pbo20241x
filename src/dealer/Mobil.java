package dealer;

public class Mobil {

    protected String id;
    protected String merk;
    protected String model;
    protected String warna;
    protected int harga;
    protected int tahun;
    protected String tipe;

    public Mobil(
        String id,
        String merk,
        String model,
        String warna,
        int harga,
        int tahun,
        String tipe
    ) {
        this.id = id;
        this.merk = merk;
        this.model = model;
        this.warna = warna;
        this.harga = harga;
        this.tahun = tahun;
    }

    public String getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public String getWarna() {
        return warna;
    }

    public int getHarga() {
        return harga;
    }

    public int getTahun() {
        return tahun;
    }
}
