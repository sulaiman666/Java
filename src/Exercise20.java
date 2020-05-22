/*Immutable object is an object that you cant change in the same way as changing value, they only can change
* reference to that object. In this demonstration of what immutable object mean is if we had (String var = "here")
* changed to (var = "i'am"), in this case program make a new object in memory that contain value "i'am" and
* var referencing that memory section. We dint change the value we just changing referenced object, String object in default
* was an Immutable object.
*
* But if you want to use other variable to behave like an immutable object you do it like the code below.
*
* Advantage: if you using multi thread processing, final method can prevent value to clashing each other*/

public class Exercise20 {
    // Global variable, that can be access and knowed by other instance
    public static final String IMMUTABLE = "immutable";

    // Trying to access global variable
    public static void main(String[] args){
        System.out.println("This is an " + IMMUTABLE + " Object");
    }

    // Trying to change the value from immutable object
//    public static void main(String[] args){
//        IMMUTABLE = "change"; // This will have an error because it was an IMMUTABLE OBJECT
//        System.out.println("This is an " + IMMUTABLE + " Object");
//    }
}
