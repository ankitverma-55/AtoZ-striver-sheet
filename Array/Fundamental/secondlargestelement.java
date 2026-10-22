//package Array.Fundamental;

public class secondlargestelement {
    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 40, 50 }; 
        int ans = secondlargtelement(numbers);
        System.out.println(ans);    


}

    public static int secondlargtelement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}

