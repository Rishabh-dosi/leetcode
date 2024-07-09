public class PeakIndex {
    static int peakIndex(int[] arr) {
        int peak = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
                peak = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;

            } else {
                return mid;
            }

        }
        return peak;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0 };
        System.out.println(peakIndex(arr));
    }
}
