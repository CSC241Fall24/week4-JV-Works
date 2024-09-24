public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        
        // If inserting at the head (position 0) or the list is empty
        if (position == 0 || head == null) {
            newNode.next = head;
            return newNode;
        }
        
        ListNode current = head;
        int currentPosition = 0;
        
        // Traverse the list until we reach the desired position or the end of the list
        while (current.next != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        
        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
}