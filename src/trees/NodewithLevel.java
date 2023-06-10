package trees;

public class NodewithLevel {
	NodewithLevel left,right;
	   int data;
	   int level;
	   
	   NodewithLevel(int item,int level){
		   data=item;
		   left = right = null;
		   this.level = level;
	   }
}
