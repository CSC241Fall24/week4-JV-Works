public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        
        // Special case: if the list is empty or we're inserting at the beginning (position 1 or less)
        if (head == null || position <= 1) {
            newNode.next = head;
            return newNode;
        }
        
        ListNode current = head;
        int currentPosition = 1;
        
        // Traverse the list to find the correct position or the last node
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
