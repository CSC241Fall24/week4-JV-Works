public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        
        // If inserting at the head (position 0)
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }
        
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; i < position; i++) {
            if (current == null) {
                break;
            }
            prev = current;
            current = current.next;
        }
        
        if (prev != null) {
            prev.next = newNode;
            newNode.next = current;
        } else {
            // If prev is null, it means position is out of bounds, so we append at the end
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }
}