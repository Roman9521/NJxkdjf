package recursion;

public class Array11 {
    public static void main(String[] args) {
        System.out.println(array11(new int[]{1,2,5,4,11,24,11,54,11,22,11,2351,15,11}, 0));
    }
    static int array11(int[] array, int index) {
        if (array.length == index)
            return 0;
        if (array[index] == 11)
            return 1 + array11(array, index + 1);
        return array11(array, index + 1);
    }
}
