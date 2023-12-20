    public static List<Integer> fibonacci(int n) {
        
       List<Integer> result = new ArrayList<>();
        if (n > 0) {
        result.add(0);
        }
        if (n > 1) {
            result.add(1);
        }
        int n1 = 0, n2 = 1, n3;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            result.add(n3);
            n1 = n2;
            n2 = n3;
        }
        return result;
        
    }