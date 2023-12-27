    public static long getNumber(SinglyLinkedListNode binary) {
    // Write your code here
     //print SinglyLinkedListNode
    //    while (binary != null) 
    //        {
    //         System.out.print(binary.data + " ");
    //         binary = binary.next;
    //     }
    //     System.out.println();

   
    
    //method2
    long ans=0;  //note always use long instead of int , when -1 occurs error
     while (binary != null) 
     {
       ans= (ans*2) + binary.data; 
    
       binary = binary.next;
     }
                                         System.out.println("ans = "+ans);
        
    return ans;
    
    }