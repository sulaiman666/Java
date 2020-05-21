public class Exercise11 {

    public static void main(String[] args){
        // For looping= Repetition with known iteration. Use it if you know the number of repetition
        // Sytax for looping for(set up; repetition condition; Termination procedure)
        for(int i = 0; i < 5; i++){
            System.out.println("Iteration number: " + i); // Printing as much as repetition
        }
        // Output should be
        /*Iteration number: 0
        * Iteration number: 1
        * Iteration number: 2
        * Iteration number: 3
        * Iteration number: 4*/
        /* If you can see its stop at 4 because we using less than five (i < 5) if you want it to stop at number
        * five you should use less than equals (i <= 5). And if you want it to start at number one you can
        * declare (i = 0) in set up to be (i = 1), these are two small detail that can ruin your code
        * so you need to remember if you use (i = 0) in less than N it will repeat the code in N,
        * and in less than equals N it will repeat the code in N+1. If you use
        * (i = 1) it will do the exact opposite, in less than N it will repeat the code in N-1,
        * and in less than equals it will repeat the code in N*/
    }
}
