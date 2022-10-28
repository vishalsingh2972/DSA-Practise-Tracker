package introduction;
//Isme constructor karta kya hai wo try kiya hai
public class ConstructorTrial {
        public static void main(String[] args) {
            // store 5 roll nos
            int[] numbers = new int[5];

            // store 5 names
            String[] names = new String[5];

            // data of 5 students: {roll no, name, marks}
            int[] rno = new int[5];
            String[] name = new String[5];
            float[] marks = new float[5];

            Student2[] students = new Student2[5];

//assigning by writing kunal.name, rahul.name, rahul.marks...etc becomes cumbersome ,so instead we can use constructor instead of writing again and again
            Student2 kunal = new Student2(4,"Kunal" , 56.9f);
            //kunal.changeName("Kunnu");
            Student2 rahul = new Student2(5,"Rahul" , 66.9f);
            Student2 anaes = new Student2(6,"Anaes" , 76.9f);

            kunal.changeName("Kunnu"); //name change before greeting();

            System.out.print("Pehla Kunal ");
            System.out.print(kunal.rno);
            System.out.print(kunal.name);
            System.out.println(kunal.marks);
            kunal.greeting();
            //kunal.changeName("Kunnu"); //name change after greeting();
            System.out.println();

            System.out.print("Dusra Rahul ");
            System.out.print(rahul.rno);
            System.out.print(rahul.name);
            System.out.println(rahul.marks);
            rahul.greeting();
            System.out.println();

            System.out.print("Tisra Anaes ");
            System.out.print(anaes.rno);
            System.out.print(anaes.name);
            System.out.println(anaes.marks);
            anaes.greeting();
            System.out.println();
        }
        static class Student2 //class name is Student2
        {
            int rno;
            String name;
            float marks;

//putting a function inside the class Student2
            void greeting() {
                System.out.println("Hello! My name is " + name);
                //System.out.println("Hello! My name is " + this.name);
            }
//Another function
            void changeName(String newName){
                name = newName; //here newName is local variable, and name is instance variable

                //this.name = newName; //mostly use this. when both names are same(i.e when both name of instance variable and local variable is same) , like in below case
                /*
            void changeName(String name)
                {
               this.name = name; //this. keyword makes the "name" (present on the left side) as an instance variable (check color for both instance variable and local variable)
                }
                 */
            }
            Student2(int rno, String name , float marks) //here constructor name must be same as class name ( Constructor synatax : AccessModifier Classname/Constructorname ( Parameters ) ), as you can see in the syntax we don't have any returntype (int, void etc.) as constructor is not returning anything
            {
                this.rno = rno;
//here also we are using this keyword as we have same variable name (i.e both instance variable and local variable have same name)
                this.name = name;
                this.marks = marks;

            }

        }
    }

//Reference: https://youtu.be/BSVKUk58K6U




