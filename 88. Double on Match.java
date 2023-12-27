   public static long doubleSize(List<Long> arr, long b) {
   
    boolean exist = true; 
    int n=arr.size();
    long k=b;
    // Search for k. After every successful 
    // search, double k and change exist to true 
    // and search again for k from the start of array 
  
    while(exist){ 
  
      exist = false; 
  
      for (int i = 0; i < n; i++) { 
  
        // Check is a[i] is equal to k 
        if (arr.get(i) == k){ 
          k *= 2; 
          exist = true; 
          break; 
        } 
      } 
  
    } 
  
    return k; 
    }