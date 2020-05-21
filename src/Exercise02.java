public class Exercise02 {

    public static void main(String[] args) {

        int JarakMaksimal = 10;
        int JarakKerumah = 11;
        int hasil = 0;

        hasil = JarakMaksimal - JarakKerumah;
        hasil = hasil * -1;

        if(JarakMaksimal >JarakKerumah) {
            System.out.println("Pengiriman barang dapat diantarkan dengan promo gratis ongkir");
        }
        if(JarakMaksimal <=JarakKerumah) {
            System.out.print("Pengiriman barang tidak mendapatkan promo gratis ongkir, dikarenakan");
            System.out.println("Jarak rumah dengan toko lebih jauh sejauh " + hasil + " km");
        }
    }
}