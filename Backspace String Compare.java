    public static String removeHash(String s) 
    {   
      String str="";
        int n=s.length();
        char[] ch=new char[n];
        int j=0;
      for(int i=0;i<n;i++)
      {   //System.out.println("i="+i); //System.out.println("s.charAt(i)="+s.charAt(i));
        if(s.charAt(i)=='#')
        {
                         
          j=j-1;         // System.out.println("j--="+j);
          if(j<0)
             j=0;
        }
        else 
        {
                  ch[j]=s.charAt(i);  //System.out.println("ch["+j+"]="+s.charAt(i));
                  j++;               // System.out.println("j++="+j);
        }
   
        
      } 
      
      //print results
             // System.out.println("ch[]=");
      for(int i=0;i<j;i++)
      {
         str=str+ch[i];  // System.out.println("str="+str); 
                // System.out.println(ch[i]); 
      }
        
      return str;
    }