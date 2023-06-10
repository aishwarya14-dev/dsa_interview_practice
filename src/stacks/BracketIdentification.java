package stacks;
import java.util.*;

public class BracketIdentification {

	public static void main(String[] args) {
	  String s;
	  Scanner sc = new Scanner(System.in);
      s = sc.nextLine();
      BracketIdentification b = new BracketIdentification();
      b.doBracketIdentification("3[a2[bc]]2[cd]e");
	}
    
	public void doBracketIdentification(String str) {
		
		Stack<Character> s = new Stack<Character>();
		StringBuilder finalresult = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			StringBuilder result = new StringBuilder();
			
			if(str.charAt(i)==']') {
				StringBuilder temp = new StringBuilder();
				while(s.peek()!='[') {
					temp = temp.append(s.pop());
				}
				temp = temp.reverse();
				s.pop(); // pop the '['
				if(Character.isDigit(s.peek())) {
					int count = s.pop();
					for(int j=0;j<count;j++) {
						result = result.append(temp);
					}
				}
				else {
					result = result.append(temp);
				}
				
				for(int j=0;j<result.length();j++) {
					s.push(result.charAt(j));
				}
				
			}
			else
			s.push(str.charAt(i));
			
		}
		
		System.out.print(finalresult);
		
	}
}
