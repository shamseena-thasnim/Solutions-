    public static int minNum(int threshold, List<Integer> points) {
    // Write your code here
       int n = 0;
        int result = points.size();

        if ((points.get(result - 1) - points.get(0)) < threshold) return result;
        
        for (int i = 0; i < points.size(); i++) {
            if ((points.get(i) - points.get(0)) >= threshold) {
                n = i;
                break;
            }
        }

        result = (n - 1) / 2;
        result += 2;

        return result;
    }