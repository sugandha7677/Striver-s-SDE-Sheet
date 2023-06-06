public class DeleteKthNodefromEnd {
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        Node temp = new Node();
        temp.next = head;
        Node slow = temp;
        Node fast = temp;
       
       for(int  i = 1; i <= K; i++) fast = fast.next;
        
       while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
       }

       slow.next = slow.next.next;
       return temp.next;

    }
}
