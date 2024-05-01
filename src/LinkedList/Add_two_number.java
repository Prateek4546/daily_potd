package LinkedList;



public class Add_two_number {
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        Node n1 = reverseList(num1);
        Node n2 = reverseList(num2);

        Node dummy = new Node(0);
        Node curr = dummy;

        int carry = 0;
        while(n1 != null &&  n2 != null){
            int val1 = n1.data;
            int val2 = n2.data;
            int val_sum = val1 + val2 + carry;
            if(val_sum > 9)
            {
                val_sum = val_sum % 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            Node node = new Node(val_sum);
            curr.next = node;
            curr = curr.next;
            n1 = n1.next;
            n2 = n2.next;
        }
        while(n1 != null){
            int val1 = n1.data;
            int val_sum = val1 + carry;
            if(val_sum > 9)
            {
                val_sum = val_sum % 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            Node node = new Node(val_sum);
            curr.next = node;
            curr = curr.next;
            n1 = n1.next;
        }
        while(n2 != null){
            int val2 = n2.data;
            int val_sum = val2 + carry;
            if(val_sum > 9)
            {
                val_sum = val_sum % 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            Node node = new Node(val_sum);
            curr.next = node;
            curr = curr.next;
            n2 = n2.next;
        }
        if(carry > 0){
            Node node = new Node(carry);
            curr.next = node;
        }
        Node y = reverseList(dummy.next);
        while(y != null)
        {
            if(y.data == 0)
            {
                y = y.next;
            }
            else
            {
                break;
            }
        }
        return y == null ? new Node(0) :  y;

    }
    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = head;

        while(next != null){
            next = next.next;
            curr.next = prev;
            prev = curr;
            if(next != null) curr = next;
        }
        return curr;
    }

}
