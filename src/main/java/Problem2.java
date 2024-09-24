
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list

        if (position < 0) {
            position = 0;
        }
        if (position == 0) {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            return newNode;
        }
        ListNode current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                break;
            }
            current = current.next;
        }
        if (current != null) {
            ListNode newNode = new ListNode(val);
            newNode.next = current.next;
            current.next = newNode;
        }
        
        return head;
    }
}
