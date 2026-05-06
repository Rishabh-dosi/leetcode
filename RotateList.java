public class RotateList {
    
    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        ListNode newHead;
        ListNode curr = head;
        int count = 1;

        while (curr.next != null) {
            curr = curr.next;
            count += 1;
        }
        k = k % count;
        System.out.println(count);

        curr.next = head;

        ListNode newTail = head;


        for (int i = 1; i < count - k; i++) {
            newTail = newTail.next;
        }
        newHead = newTail.next;
        newTail.next = null;


        return newHead;

    }
}
