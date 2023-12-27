    public static int getTripletCount(List<Integer> arr, int d) {
    // Write your code here
        int n = arr.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long tripletSum = (long) arr.get(i) + (long) arr.get(j) + (long)arr.get(k);
                    if (tripletSum % d == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }