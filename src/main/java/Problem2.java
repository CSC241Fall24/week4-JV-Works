public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        
        // If inserting at the head (position 0)
        if (position == 0) {
            newNode = head;
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
            newNode.next = current.next;
            current.next = newNode;
        } else {
            // If current is null, it means position is out of bounds, so we append at the end
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }
}