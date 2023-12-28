   public static int groupDivision(List<Integer> levels, int maxSpread) {
            Collections.sort(levels);  

            int start = 0; 

            int n=levels.size(); 

            if(n == 0) 

            return 0; 

            // If arr has some value then at least can form 1 group 

            int count = 1; 

            for(int i = 0; i < n; i++) { 

            if(levels.get(i) - levels.get(start) > maxSpread) { 

            count++; 

            start = i; 

            } 

            } 

            
            

            System.out.println("count="+count);  

            return count; 
            
 
    }