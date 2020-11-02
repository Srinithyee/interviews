/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head)
    {
        if(head == null || head.next == null) 
        {
            return true;
        }
        
        ListNode slow =head;
        ListNode fast = head;
        
        while( fast.next != null && fast.next.next != null)
        {
            fast= fast.next.next;
            slpw = slow.next;
        }
        
        ListNode HeadSecondHalf = reverse(slow.next);
        ListNode HeadFirstHalf = head;
        
        while (HeadSecondHalf != null && HeadFirstHalf != null)
        {
            if(HeadFirstHalf.val != HeadSecondHalf.va;l)
                return false;
        }
        return true
    }

    public ListNode reverse (ListNode head)
    {
        ListNode result = new ListNode();
        while(head != null)
        {
            ListNode next = head.next;
            head.next = result;
            result = head;
            head = next;
        }
        return result;
    }
}
        
