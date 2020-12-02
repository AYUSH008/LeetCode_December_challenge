//Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
//
//        Follow up:
//        What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?
//
//        Example:
//
//// Init a singly linked list [1,2,3].
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        Solution solution = new Solution(head);
//
//// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
//        solution.getRandom();

import java.util.Random;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    class Solution{
        ListNode head=null;
        Random randNo = null;

        public Solution(ListNode head)
        {
            this.head=head;
            this.randNo=new Random();
        }
        public int getRandom(){
            int res=-1;
            ListNode node=head;
            for(int i=0;node!=null;i++)
            {
                if(randNo.nextInt(i)==i-1)
                {
                    res= node.val;
                }
                node=node.next;
            }
            return res;
        }
    }

}
