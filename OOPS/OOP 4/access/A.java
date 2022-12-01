package access;

public class A {
    protected int num;
//    private int num; //private, so num can only be accessed via Getters & Setters Method
    //so now since num is private it can ONLY be accessed anywhere in A.java file, Example: getNum method, setNum method etc methods present in A.java file have access to variable num
    String name; //public String name;
    int[] arr;

    public int getNum()         {//Getter //Getter method is public, so it can be accessed from anywhere, Example: from Main.java
        return num;
    }


    public void setNum(int num) {//Setter
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

/*
NOTE:
public - access allowed everywhere
       - Example: public int num;

private - access allowed only in that file
        - access allowed in other files only via Getters & Setters Method
        - Example: private int num;

default - for other classes present in the same package, it will allow access
        - for outside packages i.e. for classes present in other packages it will not allow access/ we cannot access //basically you cannot access it outside the package
        - Example:  int num; //when we don't specify any access modifier, default one is considered by default lol!
 */
