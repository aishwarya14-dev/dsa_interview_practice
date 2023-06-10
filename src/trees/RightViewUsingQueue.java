package trees;
import java.util.*;

public class RightViewUsingQueue {
	NodewithLevel root;

	public static void main(String[] args) {
		
		RightViewUsingQueue lot = new RightViewUsingQueue();
		lot.root = new NodewithLevel(1,0);
		lot.root.left = new NodewithLevel(2,1);
		lot.root.right = new NodewithLevel(3,1);
		lot.root.left.left = new NodewithLevel(4,2);
		lot.root.left.right = new NodewithLevel(5,2);
		lot.root.right.left = new NodewithLevel(6,2);
		lot.root.right.right = new NodewithLevel(7,2);
		lot.root.left.left.left = new NodewithLevel(8,3);
		
		lot.rightView(lot.root);
	}
	
	public void rightView(NodewithLevel root) {
		Queue<NodewithLevel> q = new LinkedList<NodewithLevel>();
		if(root==null)
			return;
		
		q.add(root);
		int maxleveltraversed = -1;
		
		while(!q.isEmpty()) {
			NodewithLevel temp = q.poll();
			if(temp.level>maxleveltraversed) {
				System.out.print(temp.data+ " ");
				maxleveltraversed = temp.level;
			}
			
			if(temp.right!=null)
				q.add(temp.right);
			
			if(temp.left!=null)
				q.add(temp.left);
		}
	}

}
