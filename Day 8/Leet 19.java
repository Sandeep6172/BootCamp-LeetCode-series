class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode behindPointer = dummy;
        ListNode aheadPointer = dummy;
        for(int i=0;i<n;i++){
            aheadPointer = aheadPointer.next;
        }
        while(aheadPointer.next != null){
            behindPointer=behindPointer.next;
            aheadPointer=aheadPointer.next;
        }
        behindPointer.next=behindPointer.next.next;
        return dummy.next;


    }
        
}
