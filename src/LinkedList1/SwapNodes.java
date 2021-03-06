package LinkedList1;

public class SwapNodes {
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {

        // Checks if list is empty
        if (head == null) {
            return head;
        }

        // If n1 and n2 are equal, then
        // list will remain the same
        if (i == j)
            return head;

        LinkedListNode<Integer> temp = head, prev = null;
        LinkedListNode<Integer> node1 = null, node2 = null,
                node1_prev = null, node2_prev = null;
        int pos = 0;
        while(temp != null) {
            if(pos == i) {
                node1_prev = prev;
                node1 = temp;
            } else if (pos == j) {
                node2_prev = prev;
                node2 = temp;
            }
            prev = temp;
            temp = temp.next;
            pos++;
        }
        if(node1_prev != null) {
            node1_prev.next = node2;
        } else {
            head = node2;
        }
        if(node2_prev != null) {
            node2_prev.next = node1;
        } else {
            head = node1;
        }
        LinkedListNode<Integer> temp1 = node2.next;
        node2.next = node1.next;
        node1.next = temp1;

        return head;	//Your code goes here
    }
}
