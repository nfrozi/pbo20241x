public class ProdukValidation {

    private String objectIdentifier;
    private String errorMessage;

    private String nama;
    private int harga;

    public ProdukValidation(String nama, int harga) {
        objectIdentifier = "produk";
        errorMessage = "";

        this.nama = nama;
        this.harga = harga;
    }

    public boolean isValid() {
        boolean valid = true;

        if (nama.equals("")) {
            valid = false;
            addErrorMessage(
                "Nama",
                "tidak boleh kosong"
            );
        }
        if (harga < 500) {
            valid = false;
            addErrorMessage(
                "Harga",
                "harus di atas Rp500"
            );
        }

        return valid;
    }

    private void addErrorMessage(String property, String message) {
        this.errorMessage += "ERROR: " + property + " "
            + objectIdentifier + " "
            + message
            + "\n";
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
