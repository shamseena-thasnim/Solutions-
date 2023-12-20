    public static List<Integer> getRegions(List<String> ip_addresses) {
    // Write your code here
    
    int n=ip_addresses.size();
    //result storing
    List<Integer> result=new ArrayList<Integer>();
    
    
    //first store to string & get 1st value before dot
    for (int i = 0; i < n; i++) 
    { 
         System.out.println("ip_addresses.get(i) = "+ip_addresses.get(i));
     
        String temp = ip_addresses.get(i); // System.out.println("temp = "+temp);  
        String[] stringarray = temp.split("\\."); 
          
        int no1 = Integer.parseInt(stringarray[0]);
        int no2 = Integer.parseInt(stringarray[1]);
        int no3 = Integer.parseInt(stringarray[2]);
        int no4 = Integer.parseInt(stringarray[3]);
        
        int value=-1;
        
        
           if((no1 >= 0 && no1 <= 127) && (no2 >= 0 && no2 <= 255) && (no3 >= 0 && no3 <= 255) && (no4 >= 0 && no4 <= 255))
           {
                 value = 1; 
               
           }
          else if((no1 >= 128 && no1 <= 191) && (no2 >= 0 && no2 <= 255) && (no3 >= 0 && no3 <= 255) && (no4 >= 0 && no4 <= 255))
           {
           
                 value = 2; 
                
                 
           }
          else if((no1 >= 192 && no1 <= 223) && (no2 >= 0 && no2 <= 255) && (no3 >= 0 && no3 <= 255) && (no4 >= 0 && no4 <= 255))
            {
                 value = 3; 
                
           }
          else if((no1 >= 224 && no1 <= 239) && (no2 >= 0 && no2 <= 255) && (no3 >= 0 && no3 <= 255) && (no4 >= 0 && no4 <= 255))
           {
                 value = 4; 
            
           }
          else if((no1 >= 240 && no1 <= 255 ) && (no2 >= 0 && no2 <= 255) && (no3 >= 0 && no3 <= 255) && (no4 >= 0 && no4 <= 255))
            {
                 value = 5; 
              
           }
          else 
            value = -1;
            
            
            
           result.add(value); 
        


     }


    return result;
    
    }