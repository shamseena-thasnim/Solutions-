    public static List<Integer> getMinOperations(List<Long> kValues) {
    List<Integer> result = new ArrayList<>();
    for (long k : kValues) {
        int operations = findMinOperations(k);
        result.add(operations);
        }
        return result;
  }
        
        private static int findMinOperations(long k) {
            int operations = 0;
            while (k > 0) {
                if (k % 2 == 0) {
                    k /= 2;
                    } else {
                        k -= 1;
                        }
                        operations++;
                        }
                        return operations;
 
    }