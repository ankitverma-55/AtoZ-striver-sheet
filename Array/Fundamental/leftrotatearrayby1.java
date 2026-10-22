//package Array.Fundamental;

public class leftrotatearrayby1 {
    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 40, 50 };
        leftRotateByOne(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void leftRotateByOne(int[] arr) {
        if (arr.length == 0) {
            return; // Handle empty array case
        }
        int firstElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstElement;
    }
}
