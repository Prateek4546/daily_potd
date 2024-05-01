package LinkedList;


public class Arrange_consonants_and_vowels {

    class Node {
        char data;
        Node next;

        public Node(char data){
            this.data = data;
            next = null;
        }
    }


    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        Node v = new Node('0');
        Node dummy1 = v;
        Node Con = new Node('0');
        Node dummy2 = Con;
        Node curr = head;
        while(curr != null){
            char c = curr.data;
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                v.next = curr;
                v = v.next;
                curr = curr.next;
                v.next = null;
            }
            else
            {
                Con.next = curr;
                Con = Con.next;
                curr = curr.next;
                Con.next = null;
            }

        }
        v.next = dummy2.next;
        return dummy1.next;
    }
}
