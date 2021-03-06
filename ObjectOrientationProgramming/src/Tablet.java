@SuppressWarnings("deprecation")    // Annotation to ignore the warnings created by @Deprecated annotation
public class Tablet extends Computer {
    // Variable to store data from Tablet class
    private double screenSize;

    // Initiate tablet class
    public Tablet(){
        screenSize = 0;
    }

    // Function to store tablet data
    public void setScreenSize(double _screenSize){
        screenSize = _screenSize;
    }

    //Function to get tablet data
    public double getScreenSize(){
        return screenSize;
    }

    //Function to print type
    @Override // Annotation to tell the compiler that this function can override the function with same name in parent class
    public void whatIsIt(){
        System.out.println("This is a Tablet");
    }
}
