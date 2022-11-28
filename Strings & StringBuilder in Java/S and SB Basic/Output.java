import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
//        System.out.println(56);//here println method is calling the valueOf method , and then valurOf method is calling the toString method i.e. not only for this case but anything you print in println it calls the toString method (basically whatever you put in println does not matter which datatype(here we put 56 jo ki hain int datatype inside println), last main in the end internally in the output it is going to print a string only)
                               // and BTW here out is a ref. variable in printstream class //println is a method in printstream class

//       System.out.println("Kunal");
//        System.out.println(new int[] {2, 3, 4, 5}); //nothing given, so it will use default to string method present in the  println and print the hashcode (textually representation of the object , //but this is not very beneficial to us)
//        System.out.println(Arrays.toString(new int[] {2, 3, 4, 5})); //now by using Arrays.toString, we are telling java don't use the default toString method (like above line), instead use the toString method available in Arrays //FUNCTION OVERRIDING happens here as we are overriding the default toString function

//        String name = null;
//        System.out.println(name); //println--->valueOf--->return (obj == null) ? "null" : obj.toString(); //if obj is equal to null, give output "null" else do obj.toString. Here obj == null, hence output is "null"

//        String[] name1 = null;
//        System.out.println(name1); //same as above System.out.println(name);
//        System.out.println(Arrays.toString(name1));//similarly in toString--->if (a == null) return "null"; //here name1 == null, so that's why output will be "null"

//        System.out.println(56.toString()); // will not execute/error
//BUT when we convert this same integer into a wrapper class, we are able to use toString, see below
        Integer num = new Integer(56); // wrapper class : converts primitive datatype into object or non-primitive datatype //Basically if we want to use all OOPs principles with integer values(that are by birth primitive), we convert them into objects (non primitives) via using wrapper classes
                                            //also see here red cut over Integer, 'Integer(int)' is deprecated and marked for removal, so maybe in future java versions it might be removed, and we'll have a different syntax
        System.out.println(num.toString()); //here toString() is showing blur/grey as it is redundant/unnecessary/extra, even if you don't put internally it will apply automatically and give same output like below
        System.out.println(num); //same output even without using toString()
//        num. //now after putting num in wrapper class we can use so many functions with it by typing num. , which we cannot do it with integer values (coz integer is not an object it is a primitive,it does not have classes and stuff)
    }
}
