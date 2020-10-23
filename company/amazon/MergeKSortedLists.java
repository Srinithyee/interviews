// Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue <Integer> minheap = new PriorityQueue <Integer> ();
            for (ListNode head : list)
            {
                   while (head ! = null)
                   {
                       minheap.add(head.val);
                       head = head.next;
                   }   
            }
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        while(!minheap.isEmpty())
        {
            head.next = new ListNode(minheap.remove());
            head = head.next;
        }
            return dummy.next;    
        }
        
       
}
