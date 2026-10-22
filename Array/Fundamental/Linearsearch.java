public class Linearsearch {
	public static void main(String[] args) {
		//System.out.println("hello world");


        int numbers[] = { 10, 20, 30, 40, 50 };

        int ans = linearSearch(numbers, 30);
        System.out.println(ans);
	}

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found
    }
}
