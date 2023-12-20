    public static long getMinimumCost(List<Integer> arr) {
    // Write your code here
    
            Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (countMap.containsKey(arr.get(i))) {
                int val = countMap.get(num);
                countMap.remove(num);
                countMap.put(num, val + 1);
            }
            else {
                countMap.put(num, 1);
            }
        }
 
        List<Integer> store = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry :
                countMap.entrySet()) {
            store.add(entry.getValue());
        }
        Collections.sort(store, Collections.reverseOrder());
        long cost = 0, incr = 1;
        for (int i = 0; i < store.size(); i++) {
            cost = cost + (store.get(i) * incr);
            incr = incr + 1;
        }
        return cost;
    }