/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (lists == null || lists.size() == 0)  return null;
        Comparator<ListNode> comparator = new Comparator<ListNode>()
        {
            @Override
            public int compare(ListNode n1 , ListNode n2)
            {
                if(n1.val < n2.val) return -1;
                if(n1.val > n2.val ) return 1;
                return 0;
            }
        };
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size() , comparator);
        for(ListNode node: lists)
             if(node != null) heap.add(node); 
        
        ListNode head = null,cur = null;
        while(!heap.isEmpty()){
            if(head == null)
            {
                head = heap.poll();
                cur = head;
            }
            else{
               cur.next = heap.poll();
               cur=cur.next;
            }
            if(cur.next !=null) heap.add(cur.next);
        }
        return head;
    }
}
