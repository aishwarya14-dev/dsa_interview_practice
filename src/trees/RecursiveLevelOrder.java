package trees;

public class RecursiveLevelOrder {
	Node root;

	public static void main(String[] args) {
		
		RecursiveLevelOrder lot = new RecursiveLevelOrder();
		lot.root = new Node(1);
		lot.root.left = new Node(2);
		lot.root.right = new Node(3);
		lot.root.left.left = new Node(4);
		lot.root.left.right = new Node(5);
		lot.root.right.left = new Node(6);
		lot.root.right.right = new Node(7);
		
		int h = lot.height(lot.root);
		for(int i=1;i<=h;i++) {
			lot.printCurrentLevel(lot.root,i);
		}

	}
	
	public int height(Node root) {
		int lheight , rheight;
		
		if(root==null)
			return 0;
		
		lheight = height(root.left) ;
		rheight = height(root.right);
		
		if(lheight > rheight)
			return lheight+1;
		else
			return rheight+1;
	}
	
	public void printCurrentLevel(Node root, int level) {
        if(root == null)
        	return;
        
        if(level==1)
        	System.out.print(root.data+" ");
        
        else if(level > 1)
        {
        	printCurrentLevel(root.left,level-1);
        	printCurrentLevel(root.right, level-1);
        }
		
		
	}

}
