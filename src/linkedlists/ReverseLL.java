package linkedlists;

public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node reverse(Node head) {
		Node p = null;
		Node q = head;
		Node r = q.next;
		
		while(q.next!=null) {
			q.next = p;
			p=q;
			q=r;
			r = r.next;
		}
		
		q.next = p ;
		head = q;
		return head;
		
	}

}
