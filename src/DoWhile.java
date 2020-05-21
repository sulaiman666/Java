// Do-While loop, looping that execute the code first before checking the condition that we gave to the program
public class DoWhile {

    public static void main(String[] args){
        // Variable for loop
        int i =0;
        do{
            System.out.println("Iteration: " + i);      // Program will execute this line first
            i++;                                        // Termination procedure
        } while (i < 0);                                // While condition
        /* In this kinda loop the program will do the command first then it will check the condition thats why
        * in this example the output only have one iteration becase after that command was executed while
        * condition give us false. Thats why that loop was terminated after one iteration
        *
        * Output
        * Iteration: 0*/

    }
}
