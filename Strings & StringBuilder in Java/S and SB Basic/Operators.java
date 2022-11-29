import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
      //  NOTE: only character ' ' gets converted to ascii value, string " " never gets converted to ascii value

        System.out.println('a' + 'b'); //characters converted into their integer values(ascii values) and then added to give integer output
        System.out.println("a" + " b"); //concatenation of strings //only in this case java supports OPERATOR OVERLOADING otherwise elsewhere it does not support OPERATOR OVERLOADING (check notes pdf [Strings in detail.pdf] for more details) // + is the only operator that is intentionally overloaded in java to support String Concatenation or String Joining
                                        //"a" + "b" ---> creating another String object "ab"
        //System.out.println("a" - " b"); //Operator - cannot be applied to String, operator - only works for primitives
        System.out.println('a' + 3); //convert 'a' to its ascii integer value and then add it to 3 and give integer output
        System.out.println((char)('a' + 3)); //typecasting, here we are converting an integer to character

        System.out.println("a" + 1);//String " " so will not be converted to ascii values, sidhe concatenation hota bas
        //When an integer is concatenated/added with a String, it (the integer) is converted to its wrapper class Integer
        //i.e. here the integer 1 will be converted to Integer, now this Integer will call toString(), this toString() will return a String value that is 1, basically it will return 1 as a String "1"
        // so that is why in the end this is same as after a few steps: "a" + "1"

        System.out.println("Kunal" + new ArrayList<>());//similar logic like immediate above one("a" + 1 wala), here also ArrayList which is an Object is calling its toString method, here in this case this toString() will return an empty ArrayList, now this empty ArrayList will get concatenated with the String and print in the output
                                                        //here new ArrayList<>() is the Object that is being added to a String "Kunal"

//        ArrayList trial = new ArrayList<>();
//        trial.add(5);
//        trial.add(66);
//        trial.add("kusu");
//        System.out.println("Kunal" + trial); //adding String and filled ArrayList

        System.out.println("Kunal" + new Integer(56));//again here also, new Integer(56) is an Object, so whenever there is a String being added to any Object, for the Object(here our object is  new Integer(56)) Java will be like oh this is not a String, so Java will convert this Object into a String, java will do this conversion by calling the toString method of the Object, that toString will return a value, this value will get concatenated with the String (here "Kunal"), and we will get the output, SIMPLE!

//        System.out.println(new Integer(56) + new ArrayList<>()); //ERROR // Because the + operator in java is only defined for Primitives and when any one of the 2 values being added is a String
        System.out.println(new Integer(56) + " " + new ArrayList<>()); //NO ERROR, as atleast 1 String condition satisfied //and at last in output the entire result will be of what type---> String Type
        String ans = new Integer(56) + " " + new ArrayList<>(); //same above line written in expanded manner
        System.out.println(ans);

//        System.out.println(new ArrayList<>() + new ArrayList<>()); //Similarly ERROR
        System.out.println(new ArrayList<>() + " " +  new ArrayList<>());//NO ERROR, as atleast 1 object must be of type String condition satisfied //and at last in output the entire result will be of what type---> String Type

//OWN TRY (not in video just tried on own/ NOT IMP / EXTRA)
//        System.out.println(new Integer(56) + new Integer(56)); //here must get error as we are adding 2 objects (wrapper classes), as above for NO ERROR, as atleast 1 String condition must be satisfied BUT check println statement, internally it is taking both as integers (primitives) and adding and not as wrapper classes that's why no error (NOT SURE IF THIS IS CORRECT REASON)
//        System.out.println(56 + new Integer(56));//again even in this case even though we gave wrapper class but check internally println is taking both as integers(primitive) and adding them (NOT SURE IF THIS IS CORRECT REASON)

        System.out.println("a" + 'b'); //if one of the datatype is String answer will be String,basically whole will be converted to string

    }
}
