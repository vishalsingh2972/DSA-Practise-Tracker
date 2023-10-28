package introduction;
//Converting primitive and using it as an object
public class WrapperExample {
    public static void main(String[] args) {

        //Storing integer as an object in the heap memory (see below)
//        Integer number = 45; or
// Integer number = new Integer (45);

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);


    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }



}

