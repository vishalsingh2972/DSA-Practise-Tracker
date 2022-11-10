package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //initially 0 // here size actually is not equal to the size/length of the internal array, but it is equal to how many inputs you have given
                          //also working as index value(we are not deleting the data we are just shifting the end size pointer from last to second last while using removed that's it)

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }


    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }


    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp; // check trial.java in generics for clarity
                     //making data(instance variable/has scope throughout the program) also point to temp values, as scope of temp is only inside the resize() function, i.e. here temp (local variable)
    }


    private boolean isFull() {
        return size == data.length;
    }


    public int remove(){ //will return the value itself that has been removed //https://youtu.be/OY2lPr8h93U?t=700 (this part)
        int removed = data[--size];
        return removed;
    }


    public int get(int index) {
        return data[index];
    }


    public int size() {
        return size;
    }


    public void set(int index, int value){
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size = " + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        System.out.println(list);

        for (int i = 1; i < 14 ; i++) {
            list.add(2 * i); // in output ,in this case total arraylist length will be 20, but size = 13 (coz size = number of inputs provided)
        }

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(); //in LHS "<Integer>" is known as Generics; generics provide us a type of the value that can be entered in the ArrayList, like here only integer values can be given as input //also generic type can only be classes (~wrapper classes) type like <Integer> or <Float> etc., we CANNOT put primitives like <int> or <float> etc. in generics
//        ArrayList list2 = new ArrayList(); //if no generic is specified like here then both string, integer, float etc. anything all together can be put or printed in the same Arraylist //but in this case the Type Safety Factor is missing, as all types are allowed and there is nor barrier
        list2.add(19); //integer input no error
        //list2.add("Vishal"); //String value error as Generic specified as Integer

        System.out.println(list2);


    }
}
