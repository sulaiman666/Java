public class Computer {
    // Variable to store data from computer class
    private double cpuSpeed;

    // Function to initiate Computer java
    public Computer() {
        cpuSpeed = 0;
    };

    // Function to store cpuSpeed
    public void setCpuSpeed(double _cpuSpeed){
        cpuSpeed = _cpuSpeed;
    }

    // Function to get cpuSpeed
    public double getCpuSpeed(){
        return cpuSpeed;
    }

    // Function to print type
    @Deprecated // Annotation tell the compiler to tell the function is about to become obsolete
    public void whatIsIt(){
        System.out.println("This is a Computer");
    }
}


