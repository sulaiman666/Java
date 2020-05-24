public class Computer {
    // Variable to store data from computer class
    private double cpuSpeed;

    // Function to initiate Computer java
    Computer() {
        cpuSpeed = 0;
    };

    // Function to store cpuSpeed
    void setCpuSpeed(double _cpuSpeed){
        cpuSpeed = _cpuSpeed;
    }

    // Function to get cpuSpeed
    double getCpuSpeed(){
        return cpuSpeed;
    }
}
