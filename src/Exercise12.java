public class Exercise12 {

    public static void main(String[] args){
        // Array variable for
        String[] ForStringLoop = {"T", "H", "E", "", "C", "R", "I", "M", "S", "O", "N", "", "C", "H", "I", "N"};

        /* For looping using array variable that we provide before,
         * the repetition will be done as many arrays as we provide*/
        // For syntax for(TypesOfData VariableName : VariableWeUse)
        for(String letter : ForStringLoop){
            System.out.println(letter);
        }
        /* Output
        * T
        * H
        * E
        *
        * C
        * R
        * I
        * M
        * S
        * O
        * N
        *
        * C
        * H
        * I
        * N*/
    }
}
