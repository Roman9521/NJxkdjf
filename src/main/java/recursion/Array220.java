package recursion;

public class Array220 {
    public static void main(String[] args) {
        System.out.println(array220(new int[]{1, 2, 1, 2, 3, 5, 20, 2}, 0));
    }
    static boolean array220(int[] array, int index) {
        if(index >= array.length - 1)
            return false;

        return array[index+1] == 10 * array[index] || array220(array, index + 1);
    }
}
