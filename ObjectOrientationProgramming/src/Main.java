public class Main {
    public static void main(String[] args) {
        // write your code here
        /*                             Start WordTool.class Section                                             */

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

        /*                               End WordTool.class Section                                             */

        /*=====================================Inheritance======================================================*/

        /*                                 Inheritance Section                                                  */
        // Inheritance in programming have the same concept as we learn in biology, we know Inheritance we learn
        // parent will give their DNA to their children. In programming Inheritance we give access to child class
        // to use everything inside parent class, because child class have the same DNA as parent class

        // Initiate Computer.class
        // Computer myPc = new Computer();
        // Initiate Tablet.class
        // Tablet myTab = new Tablet();

        // Set cpuSpeed
        // myTab.setCpuSpeed(2.0);
        // Set screenSize
        // myTab.setScreenSize(14.0);

        // Printing cpuSpeed on the screen
        // System.out.println(myTab.getCpuSpeed());
        // Printing screenSize on the screen
        // System.out.println(myTab.getScreenSize());

        /*                                 Inheritance Section                                                  */

        /*                                  Overriding Section                                                  */
        // Overriding is giving other class permission to overwrite another class, it can be parent to child
        // or the other way around depending of which one you give access to. Like you can see in this example
        // both tablet and computer has same function whatIsIt

        // Variable to initiate the class
        Computer myTab = new Tablet();  // This is possible because tablet extends from computer which mean tablet
                                        // need to be declared as a Computer

        // Call Function to call the print inside the class
        myTab.whatIsIt();

        // To prevent Overriding we can use static method that wont allow it to be override by other

        // First you have make the class into static, in this example we will make exact same code as computer
        // except this time it was static and we gonna make it static

        // Variable to initiate the class
        // StaticComputer myStaticTab = new StaticTablet();    // This cant be done because we use Static inside the
                                                            // Computer that wont allow us to override the class

        // Call function to call the print inside the class
        // myStaticTab.whatIsIt();

        /*                                  Overriding Section                                                  */

        /*                                     Final Section                                                    */
        // Final method wont allow other to access it at all, you can make method to be final so it cant be
        // override by other

        // Initiate temperature class
        Temperature temp = new Temperature();

        // Print the result
        System.out.println(temp.getTempC());
        System.out.println(temp.getTempF());


        /*                                     Final Section                                                    */

        /*                                                                                                      */
        // Java allow us to have two function with same name but have different input and have a different process


        // Initiating Age.class to be use in this main function
        Age age = new Age();

        // Set age using one arguments
        age.setAge(20);
        // Printing the result
        System.out.println(age.getAge());
        // Set age using two arguments
        age.setAge(20, 5);
        // Printing the result
        System.out.println(age.getAge());

        // Using Constructor to input the data
        // Using constructor with one parameter
        Age age0 = new Age(25);
        // Using constructor with two parameter
        Age age1 = new Age(25, 5);

        // Printing result with parameter
        System.out.println(age0.getAge());
        System.out.println(age1.getAge());


        /*                                                                                                     */

    }
}
