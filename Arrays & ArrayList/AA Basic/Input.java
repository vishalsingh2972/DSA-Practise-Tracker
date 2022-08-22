import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

// TOPIC 1) ARRAY OF PRIMITIVES
        int[] arr = new int[5]; //arr.length is 5 or basically arr.length=total number of elements in the array

        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        //System.out.println(arr[3]);
        //System.out.println(arr.length);

        // Input using for loops
        for (int i = 0; i < arr.length; i++)  // this for loop will take 5 numbers as input
        {
            System.out.print("Enter index " + i + " array element: ");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // Method 3) toString() Method (best way to print among all as we get comas and brackets as well in the output)
//
//        for (int i = 0; i < arr.length; i++) // Method 1) this for loop will print out all the previously entered numbers
//        {
//            System.out.print(arr[i] + " ");
//        }
 //Method 2) for each loop:
//            for (int num : arr) { // for every element in array, print the element
//                System.out.print(num + " "); //  here num represents element of the array
//        }
            //        System.out.println(arr[5]); // index out of bound error

//TOPIC 2) ARRAY OF OBJECTS
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//
//        System.out.println(Arrays.toString(str) + "");
//        // modify
//        str[1] = "Vishal";
//
//        System.out.println(Arrays.toString(str));

        }
    }





