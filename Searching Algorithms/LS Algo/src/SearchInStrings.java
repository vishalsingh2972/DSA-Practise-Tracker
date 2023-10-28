import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Vishal";
        char Target = 'i';
        //System.out.println(search(name, Target));
        System.out.println(Arrays.toString(name.toCharArray())); // This statement is going to create a character array (i.e here it is converting string input into a character array)

                                                 //java string toCharArray() method converts this string into character array
                            //Arrays.toString (best way to print as we get comas and brackets as well in the output //refer method 3 Arrays Topic, input.java file)

    }

//    static boolean search2(String str, char target) {
//        if (str.length() == 0) {
//            return false;
//        }

//// for each loop
//        for (char ch : str.toCharArray()) // to use the for each loop we need an array so here we are converting the string into a character array (written as str.toCharArray() )
//        {
//            if (ch == target) {
//                return true;
//            }
//        }
//        return false;
//    }
}


//    static boolean search(String str, char target ) {
//        if(str.length()==0){
//            System.out.println("Empty String");
//            return false;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                System.out.println(i);
//                return true;
//            }
//        }
//        System.out.println("Nahi hai");
//        return false;
//    }
//}
