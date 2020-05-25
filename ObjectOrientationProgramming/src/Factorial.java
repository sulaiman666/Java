public class Factorial {
    // Constructor to use the Factorial class
    void Factorial(){}

    // Function to get the result
    long GetFactorial(int _Factorial){
        if(_Factorial == 1) return 1;
        return _Factorial * GetFactorial(_Factorial - 1);
    }
}
