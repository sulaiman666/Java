public class Exercise04 {

    public static void main(String[] args){
        int HargaNormal = 0;
        int DiskonPaket = 10;
        int DiskonObral = 15;
        int PaketMinimal = 5;
        int ObralMinimal = 50;
        int YangDibeli = 40;

        // Fungsi untuk mencari diskon yang didapatkan oleh pembeli
        if (YangDibeli >= ObralMinimal){
            System.out.println("Anda mendapatkan diskon obral sebesar " + DiskonObral + "%");
        } else if (YangDibeli >=PaketMinimal) {
            System.out.println("Anda Mendapatkan diskon paket sebesar " + DiskonPaket + "%");
        } else System.out.println("Anda menggunakan harga normal");
    }
}
