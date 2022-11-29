public class Palin {
    public static void main(String[] args) {
        String str = "abcba";
//        String str = null;
//        String str = "";
//        String str = " abcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if ( str == null || str.length() == 0) { //this we are putting to tackle error when we put str = "" (i.e. same as str.length() == 0) or when str = null
//            if (str.length() == 0 || str == null) //we are not putting this order as if we give str = null, this will give error
            return true;
        }

        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
