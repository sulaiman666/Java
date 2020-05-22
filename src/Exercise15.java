// Using argument that we gave to the program when we launch the program
public class Exercise15 {

    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
                System.out.println(i + " " + args[i]);
        }
    }
    /* In cmd, open the file directory of java class. Then execute this command "javac Exercise15.java"
    * to compile the code that can be run in your pc. after that just execute this command "java Exercise15 cat dog wombat"
    * this command contain "java Exercise15" to execute the compiled file, and "cat dog wombat" are the argument.
    *
    * Output
    * 0 cat
    * 1 dog
    * 2 wombat*/
}
