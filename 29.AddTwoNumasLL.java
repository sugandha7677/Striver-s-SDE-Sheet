public class 29.AddTwoNumasLL {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2){
        // Write your code here.
        LinkedListNode ans = new LinkedListNode(-1);
        LinkedListNode temp = ans;

        int carry = 0;
        while(head1 != null || head2 != null || carry != 0){
            
            int d1 = head1 != null ? head1.data : 0;
            int d2 = head2 != null ? head2.data : 0;

            int sum = d1 + d2 + carry;
            temp.next = new LinkedListNode(sum % 10);
            carry = sum / 10;
            
            if(head1 != null ) head1 = head1.next;
            if(head2 != null ) head2 = head2.next;
            temp = temp.next;
        }
        return ans.next;
    }
}
