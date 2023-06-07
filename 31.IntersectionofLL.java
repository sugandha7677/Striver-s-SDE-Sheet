public class 31.IntersectionofLL {
    
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        int firstSize = size(firstHead);
        int secondSize = size(secondHead);

        Node big = firstHead;
        Node small = secondHead;

        int diff = 0;

        if(firstSize > secondSize){
            big = firstHead;
            small = secondHead;
            diff = firstSize - secondSize;
        }else if(secondSize > firstSize){
            big = secondHead;
            small = firstHead;
            diff = secondSize - firstSize;
        }

        while(diff-- > 0 && big != null) {
            big = big.next;
        }

        while(big != null && small != null) {
            if(big == small) return big.data;
            big = big.next;
            small = small.next;
        }

        return -1;
    }

    static int size(Node node){
        int s = 0;
        while(node != null){
            s++;
            node = node.next;
        }
        return s;

    }
}
