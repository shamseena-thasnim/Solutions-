class Result {

    /*
     * Complete the 'playSegments' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY coins as parameter.
     */

    public static int playSegments(List<Integer> coins) {
    // Write your code here
  
            int count = coins.size();
        for (int i = 0; i < count; i++) {
            if (findScore1(coins, count, i) < findScore2(coins,i)) {
                return i;
            }
        }
        return 0;
    }
    

        public static int findScore1(List<Integer> coin, int n, int j)
         {
        int p = 0, point;
        for (int i = j; i < n; i++) {
            if (coin.get(i) == 1)
                point = 1;
            else
                point = -1;
            p += point;
        }
        return p;
    }

    public static int findScore2(List<Integer> coin, int j)
     {
        int p = 0, point;
        for (int i = 0; i < j; i++) {
            if (coin.get(i) == 1)
                point = 1;
            else
                point = -1;
            p += point;
        }
        return p;
    }

}