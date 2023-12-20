    public static long minStart(List<Integer> arr) {
    // Write your code here

        
        long sum = 0, smallest = 0;
        for (int i : arr) {
            sum += i;
            if (sum < smallest) {
                smallest = sum;
            }
        }
        long s = Math.abs(smallest) + 1;
 
        return s;
    }