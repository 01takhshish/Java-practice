import java.util.*;

import org.w3c.dom.Node;

// class LinkedListad {
//     ListNode head;

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

class LinkedListad{
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static ListNode deleteNode(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static ListNode reverseSublist(ListNode head, int l, int r){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=1; i<l;  i++){
            prev = prev.next;
           
        }
        ListNode curr = prev.next;
        for(int i=l;  i<r ; i++){
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
           
        }
        return dummy.next;
    }

    public static ListNode reverseNode(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
     
    
    public static ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static Boolean isPalindrome(ListNode head){
        if(head == null){
            return false;
        }
        ListNode middleNode = midNode(head);
        ListNode reverseNode = reverseNode(middleNode.next);
        ListNode curr = head;
        while(reverseNode != null){
            if(curr.val != reverseNode.val){
                return false;
            }
            curr = curr.next;
            reverseNode = reverseNode.next;
        }
        return true;
    } 

    public static void printList(ListNode head){
        ListNode curr = head;
        if (curr == null) {
            System.out.println("null");
        }
        while (curr != null) {
            System.out.print(curr.val + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static ListNode deletegrt(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = dummy.next;
        while(curr.next != null){
            ListNode currnext = curr.next;
            if(curr.val < curr.next.val){
                prev.next = prev.next.next;   
                curr = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(6);
        // head.next.next.next.next.next = new ListNode(7);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // ListNode revHead= reverse(head);
        printList(head);
        // ListNode revHead= reverse(head);
        // printList(revHead);
        // if(isPalindrome(head)){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }
        ListNode delete = deletegrt(head);
        printList(delete);
        

    }
}

