    public static int minPartitions(List<Integer> used, List<Integer> totalCapacity) {
        int n = used.size();
        long sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++)
         {                // System.out.println("1--------------");
            sum += used.get(i);
        }


        Collections.sort(totalCapacity, Collections.reverseOrder());

        int i = 0;
        while (sum > 0) 
        {                // System.out.println("2--------------");
            sum -= totalCapacity.get(i);
            i++;
            count++;
        }

        System.out.println(count);
         return count;
    }