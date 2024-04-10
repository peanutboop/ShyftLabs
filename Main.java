public class Main {
    public static int indexOfMinusOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 1, 2, 7, 8, 20, 33, -1, -1, -1, -1};
        int output1 = indexOfMinusOne(arr1);
        System.out.println(output1);

        int[] arr2 = {-1, -1, -1, -1};
        int output2 = indexOfMinusOne(arr2);
        System.out.println(output2);
    }
}
