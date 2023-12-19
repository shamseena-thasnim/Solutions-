

    public static int minimumDivisor(List<Integer> arr, int threshold) 
    {
       
        int s=1;
        int e=Collections.max(arr);//Arrays.stream(nums).max().getAsInt();
        int n=arr.size();
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int sum=0;
            for(int i=0;i<n;i++)
                sum=sum+(arr.get(i)+mid-1)/mid;
            if(sum<=threshold)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
                
        }
        return s;
    }

