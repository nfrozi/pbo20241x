package dealer;

public class MobilBensin extends Mobil {

    public MobilBensin(
            String id,
            String merk,
            String model,
            String warna,
            int harga,
            int tahun,
            String tipe
    ) {
        super(id, merk, model, warna, harga, tahun, "Bensin");
    }
}
