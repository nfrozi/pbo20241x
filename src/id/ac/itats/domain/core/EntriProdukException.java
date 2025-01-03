package id.ac.itats.domain.core;

public class EntriProdukException extends RuntimeException {

    public EntriProdukException(String customMessage) {
        super("Ada kesalahan entri produk pada field " + customMessage);
    }
}
