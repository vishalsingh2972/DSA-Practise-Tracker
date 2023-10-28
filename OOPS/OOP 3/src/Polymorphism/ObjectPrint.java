package Polymorphism;

public class ObjectPrint //extends Object
// no need to write explicitly but by default every class extends to object class
    {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

//Explicitly putting toString() method
    @Override // will override the default toString method
    public String toString() //at runtime it will determine that this toString should be run
    {
            return "ObjectPrint{" +
                    "num=" + num +
                    '}';

           // return "HALWA";
           // return "The number is " + num;
        }

    public static void main(String[] args) {
    ObjectPrint obj = new ObjectPrint(23); //cc = new cc;
     //  Object obj = new ObjectPrint(23); //pc = new cc; (Parent Class = Object Class)

      // System.out.println(obj.num);
        System.out.println(obj); //by default internally System.out.println(obj.toString());
        }

    }


