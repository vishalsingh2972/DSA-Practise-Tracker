public class Performance {
    public static void main(String[] args) {
//        System.out.println('a' + 1);
//        System.out.println((char)('a' + 1));

        String series = "";
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
//            System.out.println(ch);
            series = series + ch; // series += ch //Basically adding all the char in the series //String + char = String (Operators.java)
//            System.out.println(series);
        }
        System.out.println(series); //BUT this will cause wastage of space(as Strings are immutable(we cannot modify the value of the string), i.e. no changes can be made in the current String, so for making changes create new String each time so here at every step we are creating a new String/object, so in the end apart from the answer/last output/last object/last string rest all other previous objects have no ref. variable pointing to them they are simply wasting memory/space---> this is not a optimised approach), is not optimised as it will give us a Time Complexity of O(N2) [VERY BAD],
                                    //so wouldn't it be great if there was a datatype that would allow us to directly modify its value rather than creating new objects/Strings each time like String datatype
        //YES this direct modification of values without creating new objects everytime can be done by use of a datatype known as STRING BUILDER
    }
}
