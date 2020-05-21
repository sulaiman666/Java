public class Exercise07 {

    public static void main(String[] args){
        // Variabel
        double a = .6 + .6 + .6+ .6 + .6 + .6;
        double b = .6 * 6;

        // Print Value
        System.out.println("A Value is " + a);
        System.out.println("B Value is " + b);

        if (a != b) System.out.println("A dan B tidak Sama");
        if (Math.abs(a - b) < .001) System.out.println("A Mendekati B");
    }
}
