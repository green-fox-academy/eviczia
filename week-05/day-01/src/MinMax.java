public class MinMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        long min = 1000000001;
        long max = 0;
        long sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
