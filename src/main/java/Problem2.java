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
        
        // Traverse the list to find the correct position for insertion
        while (currentPosition < position - 1 && current.next != null) {
            current = current.next;
            currentPosition++;
        }
        
        // Insert the new node at the correct position
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
}
