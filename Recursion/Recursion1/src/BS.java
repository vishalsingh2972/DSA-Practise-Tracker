//Binary Search using Recursion

public class BS {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 55, 66, 78};
        int target = 66;
        System.out.println("The target is present at " + search(array, target, 0, array.length - 1) + " index position");
    }

    static int search(int[] arr, int target, int s, int e){

        if(s > e){ //not found the answer condition
            return -1;
        }

        int m = s + (e - s)/2;

        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]){
        //so now e = m - 1;
            return search(arr, target, s, m - 1);
        }

        //else now s = m + 1;
        return search(arr, target, m + 1, e);
    }

}

//✨🌟🧨 VVVVIP 🧨✨🌟 (variables in recursion 2 [continuation])
// if there are variables that you need to pass in the future function calls, put it inside the arguments or in the arguments of the function - like here 's' and 'e'
// if the variable is valuable in that particular function call only and that we don't need to pass in the future recursive calls, put those values in the body of the function - like here 'm'

//✨🌟🍕 VVVVIP 🍕✨🌟
// make sure to return the result of a function call because if you don't return it in the end it will be called after all the sub problems are solved and in the end it will be calling the main function, if the original one is not returned the main one will also be not returned so your answer will not be returned so return the whatever answer you're getting