import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {

        //Change a String into a Character Array
        String name = "Kunal KUNNU";
        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.getBytes()); //converts the String to bytes

//        System.out.println(name.toString()); //again here toString is extra/redundant/nahi bhi dale to chalta iske bina bhi internally ho hi raha hai apply
//        System.out.println(name); //without .toString like this, same output

//        System.out.println(name.toLowerCase()); //this will not edit name as Strings are immutable, here it will create a new object with all small letters
//        System.out.println(name); //see the original one remains intact, no changes caused

//        System.out.println(name.charAt(0));

        System.out.println(name.indexOf('a')); //gives index position of the character in the String, here a is present at index 3
        //System.out.println(name.indexOf("a")); //same output

        String name2 = " Hanuman ";
        System.out.println(name2.strip());// will remove starting and ending spaces
        System.out.println("       RamSita     ".strip());// or can do directly like this

        System.out.println(Arrays.toString(name.split(" "))); //where ever we have space from there divide it into different elements
        //System.out.println(Arrays.toString(name.split("u"))); //similarly wherever we have "u" from there divide into different elements
        
    }
}
