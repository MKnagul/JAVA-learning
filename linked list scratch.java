 class Node{
    int data;
    Node next;
}
 class LL{
    Node head;
   
    
    public  void insert(int data)
    {
        Node n = new Node();
        n.data = data;
        n.next = null;
        
        if(head == null)
        {
            head = n;
            
        }
        else{
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = n;
            
            
        }
    }
    public  void show()
    {
        Node n = new Node();
        n = head;
        while(n.next != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
         System.out.print(n.data);
    }
    
    
}


class Main{
    public static void main(String args[])
    {
        LL list = new LL();
        list.insert(5);
        list.insert(12);
        list.insert(78);
        list.insert(45);
        list.show();
    }
}