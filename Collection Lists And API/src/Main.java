/**
 * In this tutorial we will learn about Collections, Lists, ana API that we can use in java programming language
 * to benefit us in developing our system. Java have built-in collection of API letting us manipulate data with ease.
 * Also java has function that we known as Collections which is an object with multiple elements, and used to store,
 * share, process, and communicate. We know it as "Java Collections Frameworks".
 *
 * First we will learn array including manipulate the data inside the array like creating, sorting, comparing,
 * streaming, and transforming arrays.
 *
 * @author TheCrimsonChin
 * @version 0.1
 * @since 20200529
 * */

// Import the java.util.Arrays
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	// write your code here
        // Declaring array variable
        String[] kata = new String[] {"You", "Love", "I"};

        // Java built-in method for array can be call by java.util.Arrays, which is a package containing array
        // Built in method

        /*===========================================Sorting====================================================*/
        // We will try to sort the data using a built-in method, which is java.util.Arrays.sort(Variable)
        // this method will sorting the data inside the given array
        java.util.Arrays.sort(kata); // We can sort it just like that, we dint have to think of complicated algorithm to achieve it

        // Print the result we need to use the java.utils.Arrays.toString(Variable), which is a method to print all the value inside arrays
        System.out.println(java.util.Arrays.toString(kata));
        // In conventional way we will have to call each of the value from the array
        // for(i = 0; i < kata.length ; i++) System.out.println(kata[i] + " ");
        // we can achieve it with just like that

        /*===========================================Sorting====================================================*/

        /*============================================Fills=====================================================*/
        // Sometimes we want our array has an pre-filled data, java has an built-in method to fill the data neither
        // by declaring the same data for all cell by java.util.Arrays.fill or by copying existing arrays.

        // To simplify our code instead write the java.util.Arrays all the time we can use import method to
        // allow us to access all the method inside java.util.Arrays package without declaring it all the time
        // to do so we can write the code in line one to our code to import so we can access all the method in
        // more simple way. Here an example of the fills method using import

        // Declaring array variable to store the data, and we can let it empty so we can fill it
        int[] fillExample = new int[5];

        // Filling the arrays using the Arrays.fill(Variable, Value) method
        Arrays.fill(fillExample, 6);

        // Printing the arrays
        System.out.println(Arrays.toString(fillExample));

        // As we can see to call the build in method we dint need to write java.utils.Arrays anymore, because
        // we already import the package.

        // Now we will fill the array using the method Arrays.copy, there is two way to fill the data. Using
        // range of the array we want to copy, or by copy the data inside the array. we will try to use both
        // way so we can understand them

        // Copying the data using range of the array
        int[] rangeExample = Arrays.copyOfRange(fillExample, 0, 2); // the range was 0 to n-1

        // Copying the data using copy the existing array
        int[] copyExample = Arrays.copyOf(fillExample, 10); // If we had an array longer than existing array, the remaining cell will be filled with 0. But if the array was a string it will be filled with null

        // Printing the both result
        System.out.println(Arrays.toString(rangeExample)); // Printing range example
        System.out.println(Arrays.toString(copyExample)); // Printing copy example

        /*============================================Fills=====================================================*/

        /*==========================================Comparing===================================================*/
        // Comparing is a important method in programming because in programming we use a lot of boolean condition
        // to initiate specific program or terminating program. And because of that java give us the method to
        // compare the value of arrays, because comparing is a core of programming algorithm

        // In java there is two method to compare value inside arrays which is java.util.Arrays.equals() to compare
        // arrays value, and java.util.Arrays.deepEquals() to compare nested arrays/multi dimensional arrays.
        // Here some of the example

        // java.util.Arrays.equals() example
        // Declare arrays variable
        // Variable that resulting true from the comparison
        int[] equalsExample = new int[5];
        Arrays.fill(equalsExample, 6);

        // Variable with different value inside
        int[] differentExample = new int[5];
        Arrays.fill(differentExample, 3);

        //Variable with shorter length
        int[] shortExample = Arrays.copyOf(fillExample, 3);

        // Variable with longer length
        int[] longExample = Arrays.copyOf(fillExample, 10);

        // Printing the comparing result
        System.out.println(Arrays.equals(fillExample, equalsExample));
        System.out.println(Arrays.equals(fillExample, differentExample));
        System.out.println(Arrays.equals(fillExample, shortExample));
        System.out.println(Arrays.equals(fillExample, longExample));

        // java.util.Arrays.deepEquals() example
        //


        /*==========================================Comparing===================================================*/

    }
}