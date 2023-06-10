package trees;

public class TreeImplementation {
	
	Node root;

	public static void main(String[] args) {
		
		TreeImplementation t = new TreeImplementation();
		
		t.root = new Node(2);
		t.root.left = new Node(3);
		t.root.right = new Node(4);

	}

}
