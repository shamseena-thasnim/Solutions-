    public static String breakPalindrome(String palindromeStr) {
        String result="";
        if (palindromeStr.length() == 1) 
        {
            return "IMPOSSIBLE";
        }
        // convert the string to a char array
        char[] palindromeChars = palindromeStr.toCharArray();
        // replace the first non-"a" character with "a"
        for (int i = 0; i < palindromeChars.length / 2; i++) 
        {
            if (palindromeChars[i] != 'a') 
            {
                palindromeChars[i] = 'a';
                                              System.out.println(palindromeChars);
                 result=new String(palindromeChars);
                return result;
            }
            else
               result= "IMPOSSIBLE";
        }
        // if all characters were "a" then replace the last char with "b"
        palindromeChars[palindromeChars.length - 1] = 'b';
        
                                            System.out.println("result = "+(result+""));
             
        return result;//new String(palindromeChars);
        
    
    }