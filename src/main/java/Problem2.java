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
        while (current.next != null && currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        // Insert the new node at the correct position
        if (current.next == null || position == currentPosition + 1) { // Check if at end or desired position
            newNode.next = current.next;
            current.next = newNode;
        } else {
            // Handle the case where the insertion position is not at the end or the desired position
            // (This might be an error or require special handling)
            System.out.println("Error: Invalid insertion position.");
        }

        return head;
    }
}