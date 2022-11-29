public class SB { //we cannot name main class as StringBuilder as like String class, StringBuilder is also already a class internally in java.lang
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); //StringBuilder is mutable, i.e. we can make changes/edit this same object as many times as we want unlike in Performance.java case where we used Strings which was immutable (where everytime in order to make any changes we cannot edit the current object/String, where we had to create a new object every time which was not an optimised approach)
//        builder.append(55);
//        builder.append(63);
//        System.out.println(builder);

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch); //Unlike Performance.java where we had O(N2) TC and at each step new objects were being created here we are not creating new objects we are altering/editing/here adding new character to the same object at each step so here TC reduces and becomes O(N) [GOOD/better than Performance.java case/optimised]
//            System.out.println(builder);
        }

        System.out.println(builder); //Now after doing all the calculations and all we can convert this String Builder into a String by adding .toString like below
        System.out.println(builder.toString()); //like this, actually not required as you can see .toString is blur/grey as it is redundant/extra/not required explicitly as by default it is being done internally
                                                //converting StringBuilder to String

       builder.deleteCharAt(0); //builder. you'll get many methods that are available which you can apply
      //builder.delete(0, 4);
        builder.reverse();
        System.out.println(builder);
    }
}
