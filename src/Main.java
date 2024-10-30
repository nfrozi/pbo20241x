//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produk validTehJavana = new Produk(
                "Teh Javana 350",
                3000,
                "PT Sayap Mas"
        );

        System.out.println("Menampilkan objek produk yang valid:");
        System.out.println(validTehJavana.getNama() + " / " +
                validTehJavana.getHarga() + "\n");

        Produk invalidTehJavana = new Produk(
            "",
            0,
            "PT Sayap Mas"
        );

        System.out.println("Menampilkan objek produk yang tidak valid?");
        System.out.println(invalidTehJavana.getNama() + " / " +
            invalidTehJavana.getHarga());



//        Voucer vJvn = new Voucer(
//            "VC Javanatehmlti",
//            tehJavana,
//            2200
//        );
    }
}