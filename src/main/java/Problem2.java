public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        
        // Special case: if the list is empty or we're inserting at the head (position 0)
        if (position == 0 || head == null) {
            newNode.next = head;
            return newNode;
        }
        
        ListNode current = head;
        int currentPosition = 0;
        
        // Traverse the list to find the correct position
        while (current.next != null && currentPosition < position-1) {
            current = current.next;
            currentPosition++;
        }

        // Handle insertion by checking whether position 1 insertion needs special handling
        if (position == 1) {
            ListNode temp = head;
            newNode.next = temp;
            return newNode;
    }
    // Insert the new node at the correct position
    newNode.next = current.next;
    current.next = newNode;
    
    return head;
}
}
