   public static String isPangram(List<String> pangram) {
        String result="";
        int n=pangram.size();
        String str="";
        

        for(int i = 0; i < n; i++)
         {  
           str=pangram.get(i)+"";    System.out.println("str - "+str);
           result=result+getOutput(str);    System.out.println("result - "+result);
         }
      
         
     return result;
    }
    
        protected static String getOutput(String sentence) 
        {
        return (isPangram(sentence)) ? "1" : "0";
        }
        
      protected static boolean isPangram(String sentence) 
       {
           String result ="";
        String lowerSentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) 
        {
            if (lowerSentence.indexOf(letter) < 0)
            {
             return false; // System.out.println("1");
            }
        }
         return true;  //System.out.println("0");
       
      }