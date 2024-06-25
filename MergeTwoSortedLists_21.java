
import java.util.List;

public class MergeTwoSortedLists_21 {


    public static void main(String[] args) {

        MergeTwoSortedLists_21 sll = new MergeTwoSortedLists_21();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);

        MergeTwoSortedLists_21 sll2 = new MergeTwoSortedLists_21();
        sll2.head = new ListNode(1);
        ListNode sec = new ListNode(3);
        ListNode th = new ListNode(4);

        sll.head.next = second;
        second.next = third;


        sll2.head.next = sec;
        sec.next = th;

        MergeTwoSortedLists_21 result = new MergeTwoSortedLists_21();
        result.head = merge(sll.head, sll2.head);

        sll.display();
        sll2.display();
        result.display();


    }

    public static ListNode merge(ListNode a, ListNode b){


        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a != null && b != null){
            if (a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null){
            tail.next = b;
        }else {
            tail.next = a;
        }
        return dummy.next;
    }
    private static ListNode head;


    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current);
            current = current.next;
        }
        System.out.println("null");;
    }
}
