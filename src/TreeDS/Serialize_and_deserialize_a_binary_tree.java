package TreeDS;
import java.util.*;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Serialize_and_deserialize_a_binary_tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> serialize_list = new ArrayList<>();

        q.add(root);
        serialize_list.add(root.data);
        while(!q.isEmpty())
        {
            Node node = q.poll();
            if(node.left != null)
            {
                q.add(node.left);
                serialize_list.add(node.left.data);
            }
            else
            {
                serialize_list.add(-1);
            }
            if(node.right != null)
            {
                q.add(node.right);
                serialize_list.add(node.right.data);
            }
            else
            {
                serialize_list.add(-1);
            }
        }
        return serialize_list;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(A.get(0));
        q.add(root);
        int idx = 1;
        while(!q.isEmpty())
        {
            Node node = q.poll();
            int left_val = A.get(idx++);
            if(left_val != -1)
            {
                node.left = new Node(left_val);
                q.add(node.left);
            }

            int right_val = A.get(idx++);
            if(right_val != -1)
            {
                node.right = new Node(right_val);
                q.add(node.right);
            }
        }
        return root;
    }
};