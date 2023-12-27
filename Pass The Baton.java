   public static List<Integer> batonPass(int friends, long time) {

        List<Integer> result = new ArrayList<Integer>();

        long complete = time / (friends - 1);
        long balance = time % (friends - 1);
        
        if (complete % 2 == 0)
         {
            if (balance == 0) 
            {                   // System.out.println("1 ----------");
                result.add(2);
                result.add(1);
                System.out.println("2 1");
                //return "0";
            }
            else
            {
                                               //System.out.println("2 ----------");
            int x=(int)(balance);
            result.add(x);
            x=(int)(balance+1);
            result.add(x);
            System.out.println(balance + " " + (balance + 1)); 
            }

          
        } 
        else 
        {
            if (balance == 0) 
            {                           //System.out.println("3 ----------");
                result.add(friends-1);
                result.add(friends);
                System.out.println((friends - 1) + " " + friends);
                //return "0";
            }
            else
            {
                                        // System.out.println("4 ----------");
             int x=(int)(friends - balance + 1 );
            result.add(x);
            x=(int)(friends - balance);
            result.add(x);
            System.out.println((friends - balance + 1) + " " + (friends - balance)); 
            }

        }
        return result;
    }