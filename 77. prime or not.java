    public static int isPrime(long n) {
    // Write your code here
        // Corner case 
        if (n <= 1) 
            return 1; 
  
        // Check from 2 to n/2 
        for (int i = 2; i <= n / 2; i++) 
            if (n % i == 0) 
                return i; 
  
        return 1; 
    }