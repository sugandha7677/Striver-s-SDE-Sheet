public class DeleteNodeInLL {
    public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        if(node == null) return;


        node.data = node.next.data;
        node.next = node.next.next;

        
	}
}
