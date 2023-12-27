    public static int maxIndex(int steps, int badIndex) {
       
        int i = 0, j = 1;
        int cnt = 0;
        int sum = steps * (steps + 1) / 2;
        while (cnt < steps)
        {
            i += j;
            j++;
            cnt++;
            if (i == badIndex)
            {
                return (sum - 1);
            }
        }
        return sum;
    }