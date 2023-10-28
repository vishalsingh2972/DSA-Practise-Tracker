package Generics;

import java.util.Arrays;

public class trial {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));

        int[] kalindi = {9999};
        arr = kalindi;
        System.out.println(Arrays.toString(arr));

    }
}
