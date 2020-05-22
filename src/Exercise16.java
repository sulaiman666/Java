/* In this exercise we will change number value like int or double from our arguments when
 * running the program to String
 *
 * Input: java Exercise16 35 34.6*/

public class Exercise16 {

    public static void main(String[] args){
        /*Code section that change from integer arguments to string, we can achieve it using build in function
        * Integer.parseInt(args[0]). We can change args[0] to anything that we want to convert it to string*/
        if(args.length > 0){
            int Value = Integer.parseInt(args[0]);
            System.out.println("This is integer to string " + Value);
        }
        /*Code section that change from double arguments to string, we can achieve it using build in function
         * Double.parseDouble(args[0]). We can change args[0] to anything that we want to convert it to string*/
        if(args.length > 1){
            Double Valuee = Double.parseDouble(args[1]);
            System.out.println("This is double to string " + Valuee);
        }

        /*Output
        * This is integer to string 35
        * This is double to string 34.6*/
    }
}
