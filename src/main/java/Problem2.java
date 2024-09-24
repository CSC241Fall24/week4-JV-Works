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
        int i = 0;
        for (i = 0; i < position && current != null; i++) {
            prev = current;
            current = current.next;
        }
        
        if (i == position) {
            prev.next = newNode;
            newNode.next = current;
        } else {
            // If position is out of bounds, append at the end
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }
}