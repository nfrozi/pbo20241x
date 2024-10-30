//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produk tehJavana = new Produk(
            "Javana Teh Melati 350",
            3000,
            "PT Sayap Mas"
        );

        System.out.println(tehJavana.getHarga());


//        Voucer vJvn = new Voucer(
//            "VC Javanatehmlti",
//            tehJavana,
//            2200
//        );

//        System.out.println(vJvn.nama + "/" +
//                tehJavana.produsen + "\t" +
//                vJvn.nominal);
    }
}