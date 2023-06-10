package trees;

public class RightView {
	
	Node root;
	int maxleveltraversed = 0;

	public static void main(String[] args) {
		
		RightView lot = new RightView();
		
		lot.root = new Node(1);
		lot.root.left = new Node(2);
		lot.root.right = new Node(3);
		lot.root.left.left = new Node(4);
		lot.root.left.right = new Node(5);
		lot.root.right.left = new Node(6);
		lot.root.right.right = new Node(7);
		lot.root.left.left.left = new Node(8);
		
		lot.rightView(lot.root,1);

	}
	
	public void rightView(Node root,int currentlevel) {
		
		if(root == null)
			return;
		if(currentlevel>maxleveltraversed) {
			System.out.print(root.data+" ");
			maxleveltraversed = currentlevel;
		}
		
			rightView(root.right,currentlevel+1);
			rightView(root.left,currentlevel+1);
	}

}
