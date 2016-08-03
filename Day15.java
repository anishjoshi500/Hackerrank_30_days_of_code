public static  Node insert(Node head,int data)
	{
    Node nod = new Node(data);

        if (head == null) {
            head = nod;
            return head;
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }

        t.next = nod;
        return head;
    }
