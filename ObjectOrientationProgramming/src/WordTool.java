/**
 * This is a class that containing three method which is the WordCount() to count how many word in the given
 * sentence, FullCount() to count how many letters in the given sentence with or without spaces,
 * and the last one is SpecificLetter() to count how many specific letter in the given sentence.
 * @author The Crimson Chin
 * @version 0.1
 * @since 20200528*/
public class WordTool {
    public WordTool() {};

    /**
     * WordCount
     * to count how many word in the given sentence.
     * @param s given string for the program to count
     * @return int of how many word inside the given sentence*/
    public int WordCount (String s){
        // Variable to count letter
        int count = 0;

        // Check if given string is empty/null, if not then execute given code
        if(!(s == null || s.isEmpty())){
            // Using split method from string class to merge the given word by deleting whitespace
            String[] word = s.split("\\s+");
            count = word.length;
        }
        return count;
    }

    /**
     * FullCount
     * to count how many letters in the given sentence with or without spaces.
     * @param s given string for the program to count
     * @param Space boolean for telling the program to include or exclude the space
     * @return int of how many letters inside the given sentence with or without the spaces*/
    public int FullCount (String s, boolean Space){
        // Variable that used to count how many letter in given word
        int count = 0;

        // Check if the word/string given is empty or not
        if(!(s == null || s.isEmpty())){
            // If condition if text with space
            if (Space){
                // Counting the whole text with space
                count = s.length();
            } else{
                // Counting the text without space by replacing it
                count = s.replace(" ", "").length();
            }
        }
        return count;
    }

    /**
     * FullCount
     * to count how many specific letter in the given sentence.
     * @param s given string for the program to count
     * @param letter specific letter that program will count
     * @return int of how many specific letter inside the given sentence*/
    public int SpecificLetter(String s, char letter){
        // Variable to store letter count
        int count = 0;

        // Checking is it empty of not
        if(!(s == null || s.isEmpty())){
            // Count specific letter
            count = s.length() - s.replace(Character.toString(letter), "").length();
        }

        return count;
    }
}
