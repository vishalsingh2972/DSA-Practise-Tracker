public class Comparison {
    public static void main(String[] args) {
        //case 1 : Same Object Same Value (done implicitly/ automatically by java)
                              //here only 1 object is created that too inside the String Pool //usually case 1 is only used as we want to make use of the String Pool (more optimised)
        String a = "Kunal";
        String b = "Kunal";
        String c = a; //pointing to same object as ref. variable a
        String d = "Tommy";
//        System.out.println(c == a);//pointing to same object in heap so will give true

//METHOD 1 (here == is a comparator)
        // == method (where == is known as a comparator);  Checks if reference variable is pointing to the same object
//        System.out.println(a == b); //ref. variable pointing to same object in heap so will give true
//        System.out.println(a == d); //ref. variable pointing to different objects in heap so will give false


        //case 2 : Different Object Same Value (done explicitly/ hum "new" keyword laga kar bol rahe java ko name same hain par separate object phirse create karlo heap main at other location)
                                       //here it is creating BOTH the objects outside the String Pool but in heap only
        String A = new String("Kunal");
        String B = new String("Kunal");
        String C = new String("Kunal  ");
        String D = new String("Ku nal");
//        System.out.println(A == B); //now this will give output as false as ref. variable is pointing to 2 different objects (of same name present at 2 different locations in the heap,here BOTH the objects are present in heap only but outside the String Pool)


//METHOD 2 (here .equals is a function/method)
        // .equals method (when you only need to check the value)  //it does not care here whether the ref. variables are pointing to same object/different objects, it just cares about the value of the objects
//        System.out.println(a.equals(b));//ye to true hi dega obviously it is understood //same object/only 1 object present here

//        System.out.println(A.equals(B)); //will give true as although A and B are pointing to 2 different objects present at 2 different positions in the heap but the value of both the objects is equal, hence true
//        System.out.println(A.equals(C)); //dhyaan se dekh C main space hai isliye value alag hai A and C ka so false dega ye
//        System.out.println(A.equals(D));

        System.out.println(A.charAt(0));//internally string is stored like a character array you can tell
    }
}






