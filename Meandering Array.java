    public static List<Integer> meanderingArray(List<Integer> unsorted) {
        Collections.sort(unsorted);
 
        int n = unsorted.size();
        List<Integer> result = new ArrayList<>(n);
 
        // Initialize pointers
        int left = 0, right = n - 1;
 
        for (int i = 0; i < n; i++) {
            // Alternate between largest and smallest
            if (i % 2 == 0) {
                result.add(unsorted.get(right));
                right--;
            } else {
                result.add(unsorted.get(left));
                left++;
            }
        }
 
        return result;
 
    }