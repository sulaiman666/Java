public class Factorial {
    // Constructor to use the Factorial class
    public void Factorial(){}

    // Function to get the result
    public long GetFactorial(int _Factorial){
        if(_Factorial == 1) return 1;
        return _Factorial * GetFactorial(_Factorial - 1);
    }
}
