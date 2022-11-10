package Generics;

import java.util.ArrayList;
import java.util.Arrays;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

public class CustomGenArrayList<T> { //here as a template we have to provide T, where T for type

    //    private T[] data;//at runtime compiler will not understand what type is T from byte code ,so instead we will use an Object Type; as in the internal implementation of ArrayList they are also using Object type
    private Object[] data; //Object Type
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //initially 0 // here size actually is not equal to the size/length of the internal array, but it is equal to how many inputs you have given
    //also working as index value(we are not deleting the data we are just shifting the end size pointer from last to second last while using removed that's it)

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }


    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num; //Adding smaller one (RHS T Type) in bigger one (LHS Object Type), Possible! Hence, no typecasting required
    }
        private void resize () {
            Object[] temp = new Object[data.length * 2];

            // copy the current items in the new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i]; //both are Object Type so no type casting required
            }
                data = temp; // check trial.java in generics for clarity
                //making data(instance variable/has scope throughout the program) also point to temp values, as scope of temp is only inside the resize() function, i.e. here temp (local variable)
        }

        private boolean isFull () {
            return size == data.length;
        }


        public T remove ()
        { //will return the value itself that has been removed //https://youtu.be/OY2lPr8h93U?t=700 (this part)
            T removed = (T) (data[--size]); //LHS(T type) and RHS(Object Type), so here in the smaller, more restrictive type (Type T), we are trying to add a bigger type(Object Type), hence error; To remover error typecast RHS to T type and then add it in LHS
            return removed;
        }


        public T get ( int index){
            return (T) data[index];
        }


        public int size () {
            return size;
        }


        public void set ( int index, T value){
            data[index] = value; //Adding smaller one (RHS T Type) in bigger one (LHS Object Type), Possible! Hence, no typecasting required
        }


        @Override
        public String toString () {
            return "CustomGenArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size = " + size +
                    '}';
        }

        public static void main (String[]args){
//        ArrayList list = new ArrayList();
            CustomGenArrayList list = new CustomGenArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

//        System.out.println(list);
//
//        for (int i = 1; i < 14 ; i++) {
//            list.add(2 * i); // in output ,in this case total arraylist length will be 20, but size = 13 (coz size = number of inputs provided)
//        }
//
//        System.out.println(list);

//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList list2 = new ArrayList();
//        list2.add(19); //integer input no error
//        //list2.add("Vishal"); //String value error as Generic specified as Integer
//        System.out.println(list2);

            CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
            for (int i = 0; i < 14; i++) {
                list3.add(2 * i);
            }
            System.out.println(list3);



        }
    }
