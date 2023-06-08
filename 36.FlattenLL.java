public class 36.FlattenLL {
    public static Node flattenLinkedList(Node head) {
        if(head == null || head.next == null) return head;

        head.next = flattenLinkedList(head.next);

        head = mergeLL(head, head.next);

        return head;

    }

    static Node mergeLL(Node a, Node b){
        Node temp = new Node(0);

        Node curr = temp;

        while(a != null && b != null){
            if(a.data  < b.data){
                curr.child = a;
                a = a.child;
                curr = curr.child;
            }else{
                curr.child = b;
                b = b.child;
                curr = curr.child;
            }
        }

        if(a != null) curr.child = a;
        else if(b != null) curr.child = b;

        return temp.child;
    }

    // TC:  O(nlogn)
    
}
