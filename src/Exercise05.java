public class Exercise05 {

    public static void main(String[] args){
        // Variabel
        int Umur = 60;
        int DetakJangtung = 150;

        // Fungsi ngecek umur
        if (Umur == 30){
            if ((DetakJangtung >= 95) && (DetakJangtung <= 162)){
                System.out.println("Detak Jantung Anda Normal");
            } else if(DetakJangtung < 95){
                System.out.println("Detak Jantung Dibawah Normal");
            } else {
                System.out.println("Detak Jantung Diatas Normal");
            }
        } else if (Umur == 60) {
            if ((DetakJangtung >= 80) && (DetakJangtung <= 136)){
                System.out.println("Detak Jantung Anda Normal");
            } else if(DetakJangtung < 80){
                System.out.println("Detak Jantung Dibawah Normal");
            } else {
                System.out.println("Detak Jantung Diatas Normal");
            }
        } else {
            System.out.println("Umur dibawah 30 tahun");
        }
    }
}
