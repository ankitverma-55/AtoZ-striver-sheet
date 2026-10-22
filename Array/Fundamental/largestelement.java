//package Array.Fundamental;

public class largestelement {
    public static void main(String[] args) {
		//System.out.println("hello world");


        int numbers[] = { 10, 20, 30, 40, 50 };

        int ans = largtelement(numbers);
        System.out.println(ans);
	}

    public static int largtelement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

          
