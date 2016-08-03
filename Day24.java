public static Node removeDuplicates(Node head) {
      Node chead = head;
	  if (head == null)
	  return head;
        Node nexter;
		while (chead.next != null) {
			if (chead.data == chead.next.data) {
			    nexter = chead.next.next;
				//chead.next = null;
				chead.next = nexter;
			} else 
				chead = chead.next;
		}
		return head;
    }
