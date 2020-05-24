public class Main {
    public static void main(String[] args) {
        // write your code here
        // Variable to initiate the WordTool.class
        WordTool wt = new WordTool();

        // Variable to store given text
        String word = "Learning Java Object Oriented Programming";

        // Printing code to check WordTool.class is working or not
        System.out.println("Counting given text " + word);
        // Using WordCount function from WordTool.class
        System.out.println("Total words: " + wt.WordCount(word));
        // Using FullCount function with space from WordTool.class
        System.out.println("Total letter with space: " + wt.FullCount(word, true));
        // Using FullCount function without space from WordTool.class
        System.out.println("Total letter without space: " + wt.FullCount(word, false));
        // Using SpecificLetter function from WordTool.class
        System.out.println("Total amount of 'L': " + wt.SpecificLetter(word, 'L'));
    }
}
