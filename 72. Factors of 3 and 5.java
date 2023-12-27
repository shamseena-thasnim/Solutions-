   public static long getIdealNums(long low, long high) {
        long result = 0;
        int maxPower3 = getMaxPower(low, high, 3);
        int maxPower5 = getMaxPower(low, high, 5);
        for (int power3 = 0; power3 <= maxPower3; power3++) {
            for (int power5 = 0; power5 <= maxPower5; power5++) {
    long currentNumber = (long) Math.pow(3, power3) * (long) Math.pow(5, power5);
    if (currentNumber >= low && currentNumber <= high) {
        result++;
        }
        }
        }
        return result;
        }
       
        private static int getMaxPower(long low, long high, int prime) 
        {
            int maxPower = 0;
            long currentPower = 1;
            while (currentPower * prime <= high) {
                currentPower *= prime;
                maxPower++;
                }
                return maxPower;
 
    }