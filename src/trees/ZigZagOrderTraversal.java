package trees;

import java.util.Stack;

public class ZigZagOrderTraversal {
	Node root;

	public static void main(String[] args) {
	   
		ZigZagOrderTraversal lot = new ZigZagOrderTraversal();
		lot.root = new Node(1);
		lot.root.left = new Node(2);
		lot.root.right = new Node(3);
		lot.root.left.left = new Node(4);
		lot.root.left.right = new Node(5);
		lot.root.right.left = new Node(6);
		lot.root.right.right = new Node(7);
		lot.zigZagOrderTraversal();
	}
	
	public void zigZagOrderTraversal() {
		
		Stack<Node> currentLevel = new Stack<Node>();
		Stack<Node> nextLevel = new Stack<Node>();
		
		currentLevel.push(root);
		boolean righttoleft = true;
		
		while (!currentLevel.isEmpty() || !nextLevel.isEmpty()) {
			while(!currentLevel.isEmpty()) {
				Node temp = currentLevel.pop();
				System.out.print(temp.data+" ");
				if(righttoleft && temp.right!=null) {
					
					nextLevel.push(temp.right);
				}
				if(righttoleft && temp.left!=null) {
					nextLevel.push(temp.left);
				}
				
			}
			righttoleft=!righttoleft;
			
			while(!nextLevel.isEmpty()) {
				Node temp = nextLevel.pop();
			    System.out.print(temp.data+ " ");
	            if(!righttoleft && temp.left!=null) {
					
					currentLevel.push(temp.left);
				}
				if(!righttoleft && temp.right!=null) {
					currentLevel.push(temp.right);
				}
			
			}
			righttoleft=!righttoleft;
		}
	}

}
