public class WordTool {
    // Function to initiate the class if you want to access/use it from other class
    WordTool() {};

    // Function to count letter from given word
    int WordCount (String s){
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

    // Function to count letter from given word but white space/space included
    int FullCount (String s, boolean Space){
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

    // Function to count specific letter
    int SpecificLetter(String s, char letter){
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
