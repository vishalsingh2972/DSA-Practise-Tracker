
public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Vishal";
        {
//               int a = 78; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99; // values initialised in this block, will remain in block
            name = "Rahul";
            System.out.println(name);

        }

        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); //cannot use outside the block

// scoping in for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }

        System.out.println(a);
    }

}