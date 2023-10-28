package access;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       A obj = new A(99, "kunal");
        System.out.println(Arrays.toString(obj.arr));

//        ArrayList<Integer> list = new ArrayList<>(23);
//        list.DEFAULT_CAPACITY //error, can't access/change/modify as "DEFAULT_CAPACITY" variable is private (ArrayList.java line 118)


//        System.out.println(obj.num); //[DIRECT WAY-CANNOT ACCESS :( ]
        //can't access as num is private, this provides us a little-bit of security, this is data hiding
       System.out.println(obj.getNum());//[INDIRECT WAY-CAN ACCESS :) ]
        // num is private, so we do not have direct access to it; so here we indirectly access it via the getNum method (getNum method is present in same A.java file as variable num, so getNum has access to num)


    }
}