package trees;
import java.util.*;

public class LevelOrderTraversal {
	Node root;

	public static void main(String[] args) {
		
	LevelOrderTraversal lot = new LevelOrderTraversal();
	lot.root = new Node(1);
	lot.root.left = new Node(2);
	lot.root.right = new Node(3);
	lot.root.left.left = new Node(4);
	lot.root.left.right = new Node(5);
	lot.root.right.left = new Node(6);
	lot.root.right.right = new Node(7);
	
	lot.printLevelOrder();

	}
	
	public void printLevelOrder() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node tempNode = q.poll();
			System.out.print(tempNode.data + " ");
			
			if(tempNode.left!= null)
				q.add(tempNode.left);
			
			if(tempNode.right!= null)
				q.add(tempNode.right);
		}
		
	}

}
