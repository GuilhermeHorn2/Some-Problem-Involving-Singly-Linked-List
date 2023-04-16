package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		Node l = new Node(1);
		Node a = l.append(2);
		l.append(0);
		l.append(5);
		l.append(4);
		l.append(3);
		System.out.println(l);
		delete_middle_node(l,a);
		System.out.println(l);
		
	}
		
	private static void delete_middle_node(Node n,Node t){
		
		Node i = n;
		Node j = t.next;
		
		while(i.next != t) {
			i = i.next;
		}
		
		i.next = j;
		t.next = null;	
		
		
	}
	
	
	
	
    
		
	}
	
	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

