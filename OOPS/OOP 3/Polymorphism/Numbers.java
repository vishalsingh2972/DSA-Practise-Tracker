package Polymorphism;
//Compile Time Polymorphism or Static Polymorphism
public class Numbers {

//    Numbers(){  //Constructor
//        System.out.println("ABC");
//    }

    //    double sum(double a , int b){
//        return a - b;
//    }
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();  //memory being allotted constructor etc. happens at runtime
        obj.sum(2, 3); //BUT checking and everything i.e. which method to actually run will be determined at compile time, so it is known as compile time polymorphism
        obj.sum(1, 3, 7);
        //    obj.sum(5, 6, 7 ,9); //will give error while compile time only as while compile time java will check and tell there is no method which has 4 arguments, so error
//        System.out.println( obj.sum(2,3));
    }

}

