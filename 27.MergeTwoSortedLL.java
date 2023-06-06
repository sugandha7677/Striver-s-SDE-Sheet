public class MergeTwoSortedLL {
    
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> dummy = new LinkedListNode(-1);
        LinkedListNode<Integer> temp = dummy;

        while(first != null && second != null){
            if(first.data <= second.data){
                temp.next = first;
                first = first.next;
                temp = temp.next;
            }else {
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
        }

        if(first != null) temp.next = first;

        if(second != null) temp.next = second;

        return dummy.next;

	}
}
