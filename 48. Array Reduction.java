    public static int findTotalCost(List<Integer> arr) {
    // Write your code here
        int totalCost = 0;
        Collections.sort(arr);
        int size =  arr.size();
        long max = arr.get(size - 1);
 
        for (int i = 0; i < size-1; i++)
         {
            totalCost += Math.ceil(((double) arr.get(i) + max) / ((double) (max - arr.get(i)) + 1));
            
            max += arr.get(i) ;
        }
 
 

 
        return totalCost;
    }