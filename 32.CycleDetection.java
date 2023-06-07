public class CycleDetection {
    public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while(fast.next != null &&  fast.next.next != null){
            slow = slow.next;
            fast= fast.next.next;

            if(fast == slow) return true;

        }
        return false;
    }
}
