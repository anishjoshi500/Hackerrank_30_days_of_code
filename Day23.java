static void levelOrder(Node root){
      Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node h = queue.poll();

			if (h == null) {
				continue;
			}

			System.out.print(h.data + " ");

			queue.add(h.left);
			queue.add(h.right);
		}
		System.out.println();
    }
