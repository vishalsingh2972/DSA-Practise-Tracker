public class Comparison2 {
    public static void main(String[] args) {

//Example 1
        String a = "hello world!"; //inside string pool
        String b = "hello" + " world!"; //again adding will check, as already present in string pool,so even b will point to same object that a was pointing to //so again b also inside string pool
                                        //now a and b both pointing to same object inside string pool
//        System.out.println(a==b);

        String S1 = "This is"; //inside string pool
        String S2 = " a new String"; //inside string pool
        String S3 = S1 + S2; //in heap only BUT outside string pool
        String S4 = "This is a new String"; //inside string pool

//        System.out.println(S3==S4);//gives false as S4 is present inside string pool whereas S3 is present in heap only BUT outside the string pool

//        System.out.println(S3.equals(S4));//gives true as .equals checks values, although S4(present inside string pool) and S3(outside string pool) are both present in heap only but at different locations, one is present inside the string pool(S4) whereas other is present outside the string pool(S3), so ref. variables S3 and S4 are pointing to different objects in the heap memory, but the value/magnitude of those objects is same hence .equals gives true as although objects location in heap is different but their content is same

//Example 2
        String s1 = "abc"; //inside string pool
        String s2 = "def"; //inside string pool
        String s3 = "abcdef"; //inside string pool

        String s4 = s1 + s2; //not present in string pool, stored outside string pool

        String s5 = "abc" + "def"; //inside string pool //now s5 and s3 both pointing to same object inside string pool

        //System.out.println(s3==s4); //gives false //s3 is in string pool BUT s4 is in heap only, but it is present outside string pool
        //System.out.println(s3==s5); //gives true //both s3 and s5 inside string pool
//        System.out.println(s3.equals(s4)); //gives true as location chahe jo bhi ho .equals checks only content same hain ya nahi, as although s3 and s4 are present at different locations [one present inside string pool(s3), and other although present in heap only but present outside string pool(s4)], dono s3 and s4 ke andar ka content same hain, so that's why .equals true deta
//        System.out.println(s3.equals(s5)); //aur s3 and s5 to dono same object ko hi point kar rahe hai to obviously content same/ek hi hoga dono ka so isliye .equals true deta as both s3 and s5 are both pointing to the same object in the heap present inside the string pool


//Note: https://stackoverflow.com/questions/61588647/how-is-string-concatenation-working-in-following
        //https://stackoverflow.com/questions/75601214/why-is-string-concatenation-giving-true-for-one-case-and-false-for-another?noredirect=1#comment133379699_75601214

//Example 3

        //k1 and k2 ke names same hain
        String k1 = "Java"; //k1 is in String Pool
        String k2 = new String("Java"); //k2 is in heap but outside of String Pool

        System.out.println(k1==k2); //will compare location, as k1(in String Pool) and k2(in heap only but outside String Pool) isliye false
        System.out.println((k1.equals(k2))); //will compare only value, location chahe jo bhi ho, dono main value same hain isliye true

        System.out.println(k1==k2.intern());
// When comparing k1 and k2 using the == operator, it returns *false* since they have different memory addresses. //currently k1 is in String Pool and k2 is in heap but outside String Pool
// However, when we use the intern() method on k2, it returns the string object that is in the string pool or adds it to the pool and returns the new object. //k2 is added to String Pool
// When we compare k1 and k2.intern() using the == operator, it returns *true* because both references now refer to the same object in the string pool. //now both k1 and k2 are present inside String Pool or have same address i.e. both k1 and k2 now pointing to same object in the String Pool inside the heap memory

        //l1 and l2 ke names different hain
        String l1 = "python"; //in heap inside String Pool
        String l2 = new String("PYTHON"); //in heap but outside String Pool

        System.out.println(l1==l2); //false as different locations in heap
        System.out.println(l1.equals(l2)); //false as value is different for both
        System.out.println(l1==l2.intern());//now l2 is added to the String Pool, but still l1 and l2 values are different, so l2 is added inside the String Pool but at a different location than l1, i.e. l1 and l2 are different objects and are both present at 2 different locations even inside the String Pool

//https://www.linkedin.com/feed/update/urn:li:groupPost:3983267-7043062235493011457?commentUrn=urn%3Ali%3Acomment%3A%28groupPost%3A3983267-7043062235493011457%2C7043139835951210496%29
    }
}

