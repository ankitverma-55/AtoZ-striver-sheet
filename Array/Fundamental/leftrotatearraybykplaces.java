//package Array.Fundamental;

public class leftrotatearraybykplaces {
        public static void main(String[] args) {
            int numbers[] = { 10, 20, 30, 40, 50 };
            int k = 2; // Number of places to rotate
            leftRotateByKPlaces(numbers, k);
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        public static void leftRotateByKPlaces(int[] arr, int k) {
            if (arr.length == 0) {
                return; // Handle empty array case
            }
            k = k % arr.length; // Handle cases where k is greater than array length
            reverse(arr, 0, arr.length-1); // Reverse the first k elements
            reverse(arr, 0,arr.length-k-1); // Reverse the remaining elements
            reverse(arr,arr.length-k, arr.length - 1); // Reverse the entire array
        }
}
