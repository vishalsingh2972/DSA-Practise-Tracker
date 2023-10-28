package ObjectClass;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num) {
        this.num = num;
    }

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //    HashCode (will lean more in depth in hashmap lecture)
    @Override
    public int hashCode() { //hashcode basically gives us a unique representation of an object via a number/random integer value (NOT the address just a random unique number)
        return super.hashCode();
        //return num;
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
     return this.num == ((ObjectDemo)obj).num; //internal working check Strings Lecture
        //return this.gpa == ((ObjectDemo)obj).gpa;
    }

    @Override //clone() will be done later
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override //Already done
    public String toString() {
        return super.toString();
    }

    @Override //Already done in OOPS1 (WrapperExample.java)
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {

        //HashCode
//        ObjectDemo obj = new ObjectDemo(34);
//       // ObjectDemo obj2 = new ObjectDemo(34);
//       // ObjectDemo obj2 = new ObjectDemo(3200);
//        ObjectDemo obj2 = obj; //now will give same hashcode output
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());


        //Equals
        ObjectDemo obj1 = new ObjectDemo(12,56.8f);
        ObjectDemo obj2 = new ObjectDemo(12,78.9f);

//== vs .equals() explained in Strings Lecture
        if(obj1 == obj2) //== checks whether the 2 ref. variables obj1 and obj2 are pointing to the same object or not
        {
        //    System.out.println("obj1 is equal to obj2");
        }

        if(obj1.equals(obj2)) //.equals() checks the content of it
         {
         //   System.out.println("obj1 is equal to obj2");
        }


        //getClass Method
        System.out.println(obj1.getClass()); //getClass() is final so we cannot override it
    //    System.out.println(obj1.getClass().); //can be used to get some further data/details about the class
                                                //and whatever information we get from .getClass() will be stored in heap memory

    }
}
