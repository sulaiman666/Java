public class Exercise03 {

    public static void main(String[] args){
        int speed = 75;
        int speedForFine = 70;
        int maxSpeed = 60;

        // Function yang akan dijalankan
        if (speed >= maxSpeed){
            System.out.println("Melebihi kecepatan maksimal, awas mati");
            if (speed >= speedForFine){
                System.out.println("Udah kemungkinan mati harus bayar denda lg, kelar lu");
            }
        }
    }
}
