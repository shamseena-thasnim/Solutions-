    public static SinglyLinkedListNode deleteOdd(SinglyLinkedListNode listHead) {
    // Write your code here
          if (listHead == null || listHead.next == null)
           { 
             return listHead;
           }
        
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        dummy.next = listHead;
        
        SinglyLinkedListNode current = dummy;
        
        while (current.next != null && current.next.data % 2 != 0) 
        {
            current.next = current.next.next;
        }
            current = current.next;
            while (current != null && current.next != null) 
            {
                if (current.next.data % 2 != 0) {
                    current.next = current.next.next;
                    }
                    else {
                        current = current.next;
                        }
            }
        
                        return dummy.next;
      } 