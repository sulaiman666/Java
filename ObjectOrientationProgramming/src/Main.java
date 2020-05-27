@SuppressWarnings("deprecation")    // Annotation to ignore the warnings created by @Deprecated annotation
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

        /*=======================================Recursion=====================================================*/
        // Recursion is a method in algorithm that we can solve a big problem by solving the small or the basic
        // problem, in example if we want to get a one meter of wood but we only had a ruler with 30 cm long
        // we can solve it by using ruler by adding 30 cm + 30 cm + 30 cm + 10 cm by doing that we can get a
        // meter using only 30 cm ruler. In programming a lot of thing we solve by solving the basic problem
        // like if we want to get factorial number

        // First we make the factorial class

        // Then we can call the factorial using arguments this time so its can be test all the time
        // Variable to store the factorial
        Factorial equitation = new Factorial();
        int Fact = Integer.parseInt(args[0]);
        long Result = equitation.GetFactorial(Fact);
        System.out.println(Result);

        /*=======================================Recursion=====================================================*/

        /*======================================Annotation=====================================================*/
        // Annotation is a type of metadata that we can inform to the compiler about the code or function that
        // we have using an Annotation, annotation is declared using @ followed by the annotation name. We
        // gonna learn annotation using the build in annotation so we can understand the annotation better.
        // We will use three build in annotation which is the @Override, @Deprecated, and @SuppressWarnings

        // @Override annotation===============================================================================
        // We can understand the use of @Override because the name of annotation is simply the function
        // that annotation have so @Override is overriding the same overriding that we discuss before, this
        // annotation telling the compiler child class can override the parent class

        // @override example
        // First we should add the annotation in the tablet class(child class) like the one we create before and add
        // the annotation right above the function with the same name as the parents, that tells the compiler
        // in the next code after the annotation we give permission to the child to override the parent

        // Example we call the function
        Tablet myTab0 = new Tablet();
        myTab0.whatIsIt();

        // Nb: To test it use the command line because we use arguments in recursive section and need to be
        // Given arguments to run code after the Recursive Section

        // @Deprecated Annotation=============================================================================
        // Deprecated annotation is telling the compiler that function that we declare the @Deprecated
        // have changes that method below the @Deprecated annotation is about to become obsolete, like in the
        // computer class we had a function that have the same name in the tablet class because of that
        // we gonna rename it into DeviceType() and we want the compiler tell anyone compile the java file
        // will have the massage that in Computer class one of the function is about to become obsolete.

        // @Deprecated Annotation example
        // First we give the annotation in the Computer class because in that class we gonna have some changes
        // after that if we compile the compiler will give us the warning about Deprecated

        // @SuppressWarnings Annotation======================================================================
        // In the previous annotation we want the compiler to tell the function is about to become obsolete using
        // warning and error massage in the compiler, but you can tell the compiler to hide the warnings that
        // was given in the previous annotation.

        // @SuppressWarnings Example
        // In this programming code without @SuppressWarnings annotation we will had two error massage, the
        // first error is come from the tablet class, and the second error is from the Main class. both because
        // of the @Deprecated annotation in the computer class. To tell the compiler to ignore it we had to give
        // @SuppressWarnings("deprecation") in both of the class to ignore the warnings about the "deprecation"
        // you can add the @SuppressWarnings in both of class in the first or before the class function
        // to tell the compiler that we will let the compiler know to ignore it before the compiler even compile
        // the file that we want to compile


        /*======================================Annotation=====================================================*/

        /*======================================Interface======================================================*/
        // Interface allow our code to get the basic form of our class without having the real function included
        // class that implement or use the basic form from interface will not extend them just taking their form

        // Interface Example
        // First of all we need to make the interface, its a different from computer class so we need to make the
        // interface and we name it as InterfaceComputer.java, and then make the TabletWithInterface class to
        // implement the computer interface. And now we can call the function in this Main class

        // Call the constructor for TabletWithInterface Class
        TabletWithInterface ITab = new TabletWithInterface();

        // Print from the TabletWithInterface class
        System.out.println(ITab.getDeviceType());
        System.out.println(ITab.getSpeed());

        /*======================================Interface======================================================*/

        /*=====================================InnerClass======================================================*/
        // If we want our classes to be hidden from the program so far we cant do that, but if you want to
        // there is a way by using inner class type that allow the class to be private. Inner class was
        // nested inside the other class that public but the inner class can be declared as a private
        // so it was hidden from the program.

        // InnerClass Example
        // First we need to make the class that we gonna call container because it containing another
        // class inside the class. Then write this code to try the Inner Classes

        Container newContainer = new Container();
        newContainer.printContent();

        // Inner Class is has two type of it which is: method-local inner classes and anonymous classes.
        // Method-local inner classes is same as the usual declaration of the class we learn so far, the
        // only differences is the scope, so far we declare the scope of the class is the whole program
        // but in Method-local classes scope only inside the method and cant be access from other part of
        // program. And in Anonymous classes is a class that we declare and initiate in the same time,
        // and because of it our code will be more concise. We will learn Anonymous Class from the
        // example below

        // Anonymous classes Example
        // First we will make a function that have the same name as the function in the main that we will make
        // we will make the print() function, so first we will add it to the container.Java. and then
        // we will write the code below

        // Anonymous Classes
        Container AContainer = new Container(){    // We declare the container and also initiate the class in the same time
            @Override
            public void print(){
                System.out.println("This is a print from inside the Main.java");
            }
        };
        AContainer.print();
        System.out.println(AContainer.i);

        /*=====================================InnerClass======================================================*/
    }
}
