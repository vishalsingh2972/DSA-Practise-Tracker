import java.util.Scanner;

public class ReturningValues {
    public static void main(String[] args) {
        System.out.println("Before adding");//1
        int add = addedvalues();//2 ; //7(whatever line 21(or //6) sum is returning will be stored in add)
        System.out.println(add);//8
        // Instead of writing both (//2 and //8) we can also write just System.out.println(addedvalues());
        System.out.println("After adding");//9
    }

    static int addedvalues(){//3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=in.nextInt();
        System.out.print("Enter number 2: ");
        int num2=in.nextInt();
        int sum = num1 + num2;
        System.out.println("A");//4
        System.out.println(sum);//5
        return sum;//6
// return basically means this function (i.e addedvalues function(//3) ) has ended.
//i.e In any function/method when the return statement is hit, nothing after return will be executed, function call will be over as soon as return is reached and the cursor will come out of the function like here it jumped back to //7.

        //System.out.println("This will never get executed");

    }

}

//SYNTAX for Function Block (here starting from //3)
/*
        return_type name (arguments) {
            // body
            return statement;
        }
     */ 