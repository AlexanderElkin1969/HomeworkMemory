import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value1 = 33;
        Integer value2 = 11;
        Integer[] arr1 = {3,4};
        Integer[] arr2 = {3,4};

        changeValue(value1);
        changeIntegerValue(value2);
        changeValue1(arr1);
        changeValue2(arr2);
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }

    public static void changeValue(int val) {
        val = 22;
    }

    public static void changeIntegerValue(Integer val) {
        val =  22;

    }

    public static void changeValue1(Integer[] args) {
        args = new Integer[]{1,2};

    }

    public static void changeValue2(Integer[] args) {
        args[0] = 99;

    }
}