    public static int getMaxColors(List<Integer> prices, int money) {
    int maxColors = 0;
        int currentSum = 0;
        int start = 0;
 
        for (int end = 0; end < prices.size(); end++) {
            currentSum += prices.get(end);
 
            while (currentSum > money) {
                currentSum -= prices.get(start);
                start++;
            }
 
            int currentLength = end - start + 1;
            maxColors = Math.max(maxColors, currentLength);
        }
 
        return maxColors;
    }