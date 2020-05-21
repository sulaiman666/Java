public class Exercise09 {

    public static void main(String[] args){
        String suhu = "Panas Beud";

        int PengaturanSuhu = switch(suhu) {
            case "Panas Beud" -> -2;
            case "Panas aja" -> -1;
            case "Kedinginan" -> 1;
            case "Pas Beud" -> 0;
            default -> 0;
        };
        System.out.println("Hasilnya " + PengaturanSuhu);
    }
}
