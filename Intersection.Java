package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	  
		
		
		
	
		
	}
	/**
	 * 
	 * If two linked lists itersect,in the node k then all nodes from k to last will be the same.
	 */
	private static Node intersection(Node a,Node b){
		//solution1
		
		Node r = null;
		int i = a.size()-1;
		int j = b.size()-1;
		
		if(!a.get_node(i).equals(b)) {
			return null;
		}
		
	
		
		int strt = a.size() - b.size();
		if(strt < 0) {
			//b > 0
			j = -strt;
			i = 0;
		}
		else {
			//a > b
			i = strt;
			j = 0;
		}
		
	
		Node v_a = a.get_node(i);
		Node v_b = b.get_node(j);
		while(!v_a.equals(v_b)){//O(n) maybe
			v_a = v_a.next;
			v_b = v_b.next;
		}
		r = v_a;	
		return r;
		
	}   	
	
	private static Node intersction(Node a,Node b) {
		//solution 2
		
		Node r = null;
		
		int i = a.size()-1;
		int j = b.size()-1;
		
		while(a.get_node(i).equals(b.get_node(j))){//maybe O(n^2) because of the get_node method
			
			i--;
			j--;
			
		}
		
		r = a.get_node(i).next;//could be b.get_node(j).next both will point to the intersecting node
		
		
		return r;
		
	}
	
		
	}
	
  
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

