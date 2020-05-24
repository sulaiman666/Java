public class Tablet extends Computer {
    // Variable to store data from Tablet class
    private double screenSize;

    // Initiate tablet class
    Tablet(){
        screenSize = 0;
    }

    // Function to store tablet data
    void setScreenSize(double _screenSize){
        screenSize = _screenSize;
    }

    //Function to get tablet data
    double getScreenSize(){
        return screenSize;
    }
}
