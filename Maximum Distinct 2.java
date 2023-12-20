    public static int getMaximumDistinctCount(List<Integer> a, List<Integer> b, int k) {
    // Write your code here
       Set<Integer> set1 = new HashSet<>(a);
       Set<Integer> set2 = new HashSet<>(b);
       int count = 0;
       if (a.size() != set1.size()) {
           for (int i : set2) {
               if (!set1.contains(i)) {
                   count++;
                   if (count == k) {
                       return set1.size() + k;
                   } else if (a.size() == set1.size() + count) {
                       return a.size();
                   }
               }
           }
       }
       return set1.size() + count;
    }