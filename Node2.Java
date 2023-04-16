package misc;

public class Node {
	
	Node next = null;
	int data;
	
	
	public Node(int d){
		data = d;
	}
	
	public Node append(int d){
		Node novo = new Node(d);
		Node n = this;
		
		while(n.next != null) {
			n = n.next;
		}
		n.next = novo;
		
		return novo;
	}
	
	
	
	public String toString() {
		
		Node n = this;
		
		String s = "";
		while(n != null) {
			s += n.data;
			if(n.next != null) {
				s += ",";
			}
			n = n.next;
		}
		
		return s;
		
	}

}
