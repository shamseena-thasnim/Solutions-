    public static long getMaxXor(long n) {
    // Write your code here
    
     long x= (int) Math.floor(Math.log(n) / Math.log(2)) + 1;
      return (long)(Math.pow(2, x) - 2);
 
    }