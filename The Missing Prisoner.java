public static List<Integer> missingPrisoner(List<List<Integer>> locations) {
        //note: re,comment all print statemnets to not get TLE
        //result
        List<Integer> result=new ArrayList<Integer>();
        
        Map<Integer, Integer> mapx = new HashMap<>();
        Map<Integer, Integer> mapy = new HashMap<>();
        for (int i = 0; i < locations.size(); i++) 
        {
             String s=locations.get(i)+"";    //System.out.println(i+" -> "+s);
             s=s.replace("[", "").replace("]", "");       // System.out.println(i+" -> "+s);
            String[] str=s.split(", ");     // System.out.println(" str[0] = "+str[0]+",    str[1] = "+str[1]);
            String x=str[0]+"";     //System.out.println(" x = "+x);
            String y=str[1]+"";       //System.out.println(" y = "+y);
             
            int x1=Integer.parseInt(x);    //System.out.println(" x1 = "+x1);
            int y1=Integer.parseInt(y);    //System.out.println(" y1 = "+y1);
            mapx.put(x1, (int)mapx.getOrDefault(x1, 0) + 1);
            mapy.put(y1, (int)mapy.getOrDefault(y1, 0) + 1);
           
        }

   // System.out.println("mapx---------------------");
        for (Map.Entry<Integer, Integer> entry : mapx.entrySet()) {
            if (entry.getValue() % 2 == 1) 
            {
                result.add(entry.getKey());
                //System.out.println(entry.getKey());
            }
        }
        // System.out.println("mapy----------------");

        for (Map.Entry<Integer, Integer> entry : mapy.entrySet()) {
            if (entry.getValue() % 2 == 1) 
            {
                 result.add(entry.getKey());
               // System.out.print(entry.getKey() + " ");
            }
        }

       

        return result;
  
    }
