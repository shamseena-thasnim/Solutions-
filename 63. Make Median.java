  public static long getMinimumMoves(List<Integer> price, int k) {
    // Write your code here
        Collections.sort(price);
        long count = 0;
        int n = price.size();
        int mid = (n + 1) / 2 - 1;

        if (price.get(mid) == k) {
            return 0;
        } else if (price.get(mid) < k) {
            for (int i = mid; i < price.size(); i++) {
                if (k - price.get(i) > 0) {
                    count += Math.abs(price.get(i) - k);
                }
            }
        } else {
            for (int i = mid; i >= 0; i--) {
                if (price.get(i) - k > 0) {
                    count += Math.abs(price.get(i) - k);
                }
            }
        }

        return count;
    }