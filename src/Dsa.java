

// public class Dsa {
//     public static void main(String args[]){
//         ArrayList<Integer> numbers = new ArrayList<>();
//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);
//         numbers.add(40);
//         numbers.add(50);
//         System.out.println(numbers.size());
//         System.out.println(numbers);
//         System.out.println(numbers.get(2));
//         numbers.remove(numbers.get(3));
//         numbers.add(60);
//         System.out.println(numbers);
//         for(int i=0; i<numbers.size(); i++){
//             if(numbers.get(i) == 30){
//                 System.out.println("Its is present at "+ i);
//                 break;
//             }

//         }

//         int arr = {2,3,4,2,4,4};
//         int n = arr.length();
//         int temp =0;
//         for (int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                if (arr[j] > arr[j+1]){
//                 temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1]= arr[j];
//                }
//             }
//         }


//     }
// }
// public class Dsa {
//     public static boolean isPalindrome(int number) {
//         int originalNumber = number;
//         int reversedNumber = 0;

//         while (number > 0) {
//             int digit = number % 10;
//             reversedNumber = reversedNumber * 10 + digit;
//             number /= 10;
//         }

//         return originalNumber == reversedNumber;
//     }

// public static void main(String[] args) {
//         int number = 121;

//         if (isPalindrome(number)) {
//             System.out.println(number + " is a palindrome.");
//         } else {
//             System.out.println(number + " is not a palindrome.");
//         }
//     }
// }
import java.util.*;

// import org.w3c.dom.Node;

public class Dsa {
        Node head;
        private int size;

        Dsa(){
          size =0;
        }

        public class Node{
            int data;
            Node next;

            Node(int data){
              this.data= data;
              this.next = null; 
            }
        }
// ---------------------------------------------------


        public void addFirst(int data){
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
            size ++;
            
        }
// ---------------------------------------------------


        public void addLast(int data){
          Node new_Node = new Node(data);
          if(head == null){
            System.out.println("null");
            return;
          }

          Node currNode = head;
          while(currNode.next != null){
            currNode = currNode.next;
          } 

          currNode.next = new_Node;
           size++;
        }
// ---------------------------------------------------


        public void removefirst(){
          if(head == null){
            System.out.println("null");
            return;
          }
          size--;
          head = head.next;
        }
// ---------------------------------------------------
        public void removeLast(){
          if(head == null){
            System.out.println("null");
            return;
          }
          size--;
          if(head.next == null){
            head = null;
            return;
          }
          Node curNode = head;
          Node lastNode = head.next;
          while(lastNode.next != null){
             curNode = curNode.next;
             lastNode = lastNode.next;
          }
          curNode.next = null;
        }
// -----------------------------------------------------------------------------

        public Node removetheNthNode(Node head, int n){
          if(head == null){
            return head;
          }
          int count =0;
          while(head != null){
            count++;
            head = head.next; 
          }  
          int i = count - n;
          Node curr = head;
          while(i != 0){
            curr = curr.next;
            i--;
          }
          curr = curr.next.next;
          return curr.next;
        }
// -----------------------------------------------------------------------------

        public Node remove(Node head, int n){
          if( n <0){
            return head;
          }

          if( head == null && n>1 ){
            return head;
          }
          if(n==1){
            return head.next;
          }

          head.next = remove(head.next, n-1);
          return head;
        }
// ------------------------------------------------------

        public void printll(){
          Node currNode = head;

          while(currNode != null){
            System.out.print(currNode.data + " --> ");

            currNode = currNode.next;
          }
          System.out.println("null");
        }
//----------------------------------------------------------
        public int getsize(){
          return size;
        }
//--------------------------------------------------------------
        public void listIterate(){
          if(head == null || head.next == null ){
             return;
          }
          Node prev = head;
          Node curr = head.next;
          while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
          }
          head.next = null;
          head = prev;
        }
// -----------------------------------------------------------------------------

        public void swapNode(){
          if(head ==null || head.next == null ){
            return;
          }
          Node prev = head;
          Node curr = head.next;
          Node temp;
          while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev.next = temp.next;
            prev = temp;
            curr = temp.next;
          }
          temp = null;
          
        }
// -----------------------------------------------------------------------------

        public Node reverseBetween(Node head,int left, int right) {
          if(head == null){
            return head;
          }
          Node dummy = new Node(0);
          dummy.next = head;
          Node first = dummy;
          while(left !=0){
            first = first.next;
            left--;
          }
          
          Node prev = first;
          Node curr = first.next;
          right = right - left;
          while(right != 0){
            Node nextNode = curr.next;
            curr.next = prev;
            nextNode = curr;
            curr = nextNode;
            prev = prev.next;
            right--;
          }
          curr.next = first;
          first.next = curr.next;
          return dummy.next;     
    }
// -----------------------------------------------------------------------------

        public Node listRecursion(Node head){
          if(head == null || head.next == null){
            return head;
          }

          Node new_head = listRecursion(head.next);
          head.next.next = head;
          head.next = null;
           return new_head;
        }


        public static void main(String[]  args){
           Dsa list = new Dsa();
           list.addFirst(5);
           list.addFirst(4);
           list.addFirst(9);
           list.addFirst(6);
           list.addLast(2);
           list.printll();
          //  list.head = list.remove(list.head, 2);
          // list.head = list.reverseBetween(list.head, 2, 4);
           list.swapNode();
          // //  list.remove(2);
          // list.reverseBetween(1, 4);
           
           list.printll();
          // list.head = list.listRecursion(list.head);
          //  list.printll();

          //  LinkedList<String> listlis = new LinkedList<>();
          //  listlis.addFirst("nope");
          //  listlis.add("last");
          //  System.out.println(listlis);
          //  listlis.add(1,"linked");
          //  System.out.println(listlis);

          //  LinkedList<Integer> list = new LinkedList<>();
          //  list.addFirst(1);
          //  list.addFirst(2);
          //  list.add(7);
          //  list.add(6);
          //  list.add(3);
          //  System.out.println(list);
          // //  list.listIterator();
          // list.remove(2);
          //  System.out.println(list);

        }
}









