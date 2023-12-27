    public static int countStudents(List<Integer> height) {
    // Write your code here
    int n=height.size();
    List<Integer> sorted=new ArrayList<Integer>(height);;
    Collections.sort(sorted);
    for(int i=0;i<n;i++)
       System.out.println(sorted.get(i)+" , ");
    int count=0;
    for(int i=0;i<n;i++)
    {
        if( height.get(i) != sorted.get(i) )
        {
              count++;
           // System.out.println(height.get(i)+" , "+height.get(i+1)); //System.out.println("count = "+count);
        }
        
    }
    if(count==0)
        return 0;
    else
     return count;
    }