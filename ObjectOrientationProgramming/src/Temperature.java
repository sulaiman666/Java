public class Temperature {
    // Variable for Temperature class
    public double tempC = 25;

    // Function to print in Celsius
    public double getTempC(){
        System.out.println("The Temperature is: " + tempC + " C");
        return tempC;
    }

    // Function to print in fahrenheit
    public final double getTempF(){
        return tempC * 9/5 + 32;
    }

}
