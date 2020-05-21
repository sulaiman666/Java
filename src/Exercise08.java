public class Exercise08 {

    public static void main(String[] args){
        int Musim = 3;
        String MusimApa;

        switch(Musim) {
            case 1: MusimApa = "Spring";
                break;
            case 2: MusimApa = "Summer";
                break;
            case 3: MusimApa = "Fall";
                break;
            case 4: MusimApa = "Winter";
                break;
            default: MusimApa = "Nggak ada musim njing";
                break;
        }
        System.out.println("Musim saat ini adalah " + MusimApa);
    }
}
