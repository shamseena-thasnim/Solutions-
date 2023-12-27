    public static int findLongestSubsequence(List<Integer> arr) {
    // Write your code here
    
    int result=0;
        int n=arr.size();
        Collections.sort(arr);
        int firstOdd, firstEven, lastOdd, lastEven;
        firstOdd = firstEven = lastOdd = lastEven = -1;
        for (int i = 0; i < n; i++) {
            if (firstOdd == -1 && arr.get(i) % 2 == 1) 
            {
                firstOdd = i;
            }
            if (firstEven == -1 && arr.get(i) % 2 == 0) 
            {
                firstEven = i;
            }
            if (arr.get(i) % 2 == 0) 
            {
                lastEven = i;
            } 
            else 
            {
                lastOdd = i;
            }
        }
        if (lastOdd - firstOdd > lastEven - firstEven) 
        {
            result=(lastOdd - firstOdd + 1);
            System.out.println(lastOdd - firstOdd + 1);
        } else
         {
             result=(lastEven - firstEven + 1);
            System.out.println(lastEven - firstEven + 1);
        }
        
        return result;
    }