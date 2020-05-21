public class Exercise13 {

    public static void main(String[] args){
        // Array variable for
        String[] ForStringLoop = {"T", "H", "E", "", "C", "R", "I", "M", "S", "O", "N", "", "C", "H", "I", "N"};

        /* For looping using array variable that we provide before,
         * the repetition will be done as many arrays as we provide.
         * But in this exercise we will have skip iteration and
         * force stop the repetition so it will jump out of the loop.*/
        // For syntax for(TypesOfData VariableName : VariableWeUse)
        for(String letter : ForStringLoop){
            if(letter.equals("M")){
                continue; // Repetition will not print M because using continue we skip it/jump to next iteration.
            }
            else if(letter.equals("O")){
                break; //
            }
            else System.out.println(letter);
        }
        /* output
        * T
        * H
        * E
        *
        * C
        * R
        * I
        * S*/
    }
}
