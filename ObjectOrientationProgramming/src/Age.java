public class Age {
    // Variable to store the age
    public double umur = 0;

    // Constructor to initiate the Age.class
    Age(){
        umur = 0;
    }

    // Constructor with one parameter
    Age(double _umur){
        umur = _umur;
    }

    // Constructor with two parameter
    Age(int year, int month){
        umur = year + (double) month / 12;
    }

    // Function to store data with one argument(year) to Age.class
    void setAge(double _umur){
        umur = _umur;
    }

    // Function to store data with two arguments(year, month) to Age.class
    void setAge(int year, int month){
        umur = year + (double) month / 12;
    }

    // Function to get data from Age.class
    double getAge(){
        return umur;
    }

}
