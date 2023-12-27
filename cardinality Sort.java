    public static List<Integer> cardinalitySort(List<Integer> nums) { 
        //https://www.geeksforgeeks.org/sort-array-according-count-set-bits/
    
        Comparator<Integer> customComparator = (a, b) -> {
            int cardinalityA = Integer.bitCount(a);
            int cardinalityB = Integer.bitCount(b);
 
            if (cardinalityA != cardinalityB) {
                return Integer.compare(cardinalityA, cardinalityB);
            } else {
                return Integer.compare(a, b);
            }
        };
 
        // Sorting the list using the custom comparator
        Collections.sort(nums, customComparator);
 
        return nums;
    }