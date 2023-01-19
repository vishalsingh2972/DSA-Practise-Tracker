import java.util.Arrays;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class E10 {
    public static void main(String[] args) {
        String ans = "abcefghijklmnopqrstuvwxyz"; //d nai hai isme
        System.out.println(checkIfPangram(ans));
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26 || sentence == null) {
            return false;
        }

        //using character
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.contains(String.valueOf(i)) == false) { //or if (!sentence.contains(String.valueOf(i)))
                return false;
            }
        }
        return true;
    }
    //OR
    //using integer
//        for(char i = 97; i <= 122 ;i++){ //ASCII value of a = 97 and z = 122
//            if(sentence.contains(String.valueOf(i)) == false) { //or if(!sentence.contains(String.valueOf(i)))
//                return false; }
//        }
//            return true;
//        }
}

//Another easy alternative (Easiest wala)

//    public static boolean checkIfPangram(String sentence) {
//        //System.out.println(sentence.indexOf('a')); //output 0 index
//        //System.out.println(sentence.indexOf('d')); //d not present so output -1
//
//        if(sentence.length() < 26 || sentence == null) {
//            return false;
//        }
//        for(char c = 'a' ; c <= 'z'; c++){
//            if(sentence.indexOf(c) == -1){ //indexOf() method returns the position of the first occurrence of specified character(s) in a string
//                return false;
//            }
//        }
//        return true;
//    }
//}
