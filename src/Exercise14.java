// While loop exercise
public class Exercise14 {

    public static void main(String[] args){
        // Variable for set up while loop
        int i = 0;

        // While loop
        while(i < 10){                              // While is looping that repeat as long condition inside while result is true
            System.out.println("Iteration: " + i);  // Code that we execute inside loop
            i++;                                    // Termination procedure that repeated every time the program loop until while condition is not true, dont forget to make a termination procedure or your loop will have infinite loop
        }
        /* While loop is better to be use when you only know when to stop but you don't know how much
        * iteration until we get the result that we want */
        /* Output
        * Iteration: 0
        * Iteration: 1
        * Iteration: 2
        * Iteration: 3
        * Iteration: 4
        * Iteration: 5
        * Iteration: 6
        * Iteration: 7
        * Iteration: 8
        * Iteration: 9*/
    }
}
