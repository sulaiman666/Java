/*Make an program that check user Systolic Blood pressure is it in ideal range (90 - 120) or not, and also
* check user Diastolic blood pressure is it in ideal range (60-80) or not. After that print massage to user
* but using error massage (System.err.println) instead normal massage (System.out.println) */
public class Activity01 {
    public static void main(String[] args){
        // Variable of range
        // Systolic Range
        int LowSystolic = 90;
        int IdealSystolic = 120;
        int MaxSystolic = 140;

        // Diastolic Range
        int LowDiastolic = 60;
        int IdealDiastolic = 80;
        int MaxDiastolic = 90;

        // Variable store input
        int[] input = new int[2];

        // Variable to store args
        for(int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(args[i]);
        }

        for(int j = 0; j < args.length; j++){
            switch(j){
                case 0: if(input[j] < LowSystolic) System.err.println("Low Systolic Blood Pressure");
                        else if(input[j] <= IdealSystolic) System.err.println("Ideal Systolic Blood Pressure");
                        else if(input[j] <= MaxSystolic) System.err.println("Pre-High Systolic Blood Pressure");
                        else if(input[j] > MaxSystolic) System.err.println("High Systolic Blood Pressure");
                break;
                case 1: if(input[j] < LowDiastolic) System.err.println("Low Diastolic Blood Pressure");
                        else if(input[j] <= IdealDiastolic) System.err.println("Ideal Diastolic Blood Pressure");
                        else if(input[j] <= MaxDiastolic) System.err.println("Pre-High Diastolic Blood Pressure");
                        else if(input[j] > MaxDiastolic) System.err.println("High Diastolic Blood Pressure");
                break;
            }
        }
    }
}
