 public static long getNumPairs(List<Integer> arr, int l, int r) 
    {
    // Write your code here
        Collections.sort(arr);
        long numPairs = 0;
 
        for (int i = 0; i < arr.size(); ++i) {
            int lowIndex = lowerBound(arr, i + 1, arr.size(), l - arr.get(i));
            int highIndex = upperBound(arr, i + 1, arr.size(), r - arr.get(i));
            numPairs += (highIndex - lowIndex);
        }
        return numPairs;
    }
 
    private static int lowerBound(List<Integer> arr, int start, int end, int value) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
 
    private static int upperBound(List<Integer> arr, int start, int end, int value) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) <= value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
  