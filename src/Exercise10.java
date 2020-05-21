public class Exercise10 {

    public static void main(String[] args){
        // Variabel
        String Suhu = "Panas Beud";

        //variabel dengen Switchcase
        int PengaturanSuhu = switch(Suhu){
            case "Panas Beud" -> -2;
            case "Panas Aja" -> -1;
            case "Dingin Aja" -> 1;
            case "Pas Beud" -> 0;
            default -> 0;
        };

        // Hasil dari variabel
        System.out.println("Pengaturan suhu yang diperlukan " + PengaturanSuhu);
    }
}
