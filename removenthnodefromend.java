package DSA;

public class removenthnodefromend {
 
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // INSERT at head - O(1)
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // DISPLAY (safe only if no cycle)
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public void removenth(int n)
    {
        Node dummy=new Node(0);
        dummy.next=head;

        Node slow=dummy;
        Node fast=dummy;

        for(int i=0;i<=n;i++)
        {
            if(fast==null)
            {
                return;
            }
            fast=fast.next;
        }

        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        head=dummy.next;
    }


    public static void main(String[] args) {

        removenthnodefromend list = new removenthnodefromend();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // List is now: 40 -> 30 -> 20 -> 10 -> NULL
        list.display();

        list.removenth(2);
        list.display();
    }
}

