package enumExamples;

public class Basic {
    enum Week implements A, B { //YES enum can implement as many interfaces as we want
                    // BUT enum cannot extend anything else, it cannot be a child class & An enum cannot be a superclass (parent class) also
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these(upar wale) are known as enum constants
        // and all are by default public, static and final members
        // since it is final we cannot create child enums (as final keyword prevents inheritance)
        // The type of all of these is where they are declared; so the type of all of these (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday) is Week


//        void display(); //error as enum dusre ko override kar sakta jaise niche kar raha hai par enum ke method ko override nahi kar sakte hai hum; abstract method (example: OOP5/AbstractDemo/Parent.java) ke jaise empty method is not allowed, methods declared should have body
//        void display(){
//          //this is allowed
//        }


        Week() { //constructor //here we cannot create objects explicitly, so we cannot invoke this constructor explicitly; it will only happen when we try to access something like Week.Monday //**
//            System.out.println("Constructor called for " + this);
//            System.out.println("Constructor called for " + this.toString()); //can also put like this but the .toString() part is redundant or extra
        }
        // this constructor is not public or protected, only private or default
        // why? we don't want to create new objects
        // this is not the enum concept, that's why
                                     //Detailed // because if we make it public or protected it will allow initialisation of more than one objects, but for enum we want it be constant number of objects only (here we want constant number of objects for Week)

        @Override //interface implements overriding method
        public void hello() {
            System.out.println("Hey how are you?");
        }

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday; //** here even if we try to access just one enum constant, constructor will call all the values Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        Week week = Week.Monday; //or can also write directly like this in 1 line
        Week week2 = Week.Tuesday;

//        for(Week day : Week.values()){ //values() method can be used to return all values present inside enum
//            System.out.println(day);
//        }

//        System.out.println(week); //coz we have given Week.Monday in week (upar dekho)
//        System.out.println(week.ordinal()); //Order is important in enums. By using ordinal() method, each enum constant index can be found, just like array index
//        System.out.println(week2.ordinal());
//        System.out.println(Week.valueOf("Monday")); //valueOf() method returns the enum constant of the specified string value, if exists

       week.hello();

    }
}
