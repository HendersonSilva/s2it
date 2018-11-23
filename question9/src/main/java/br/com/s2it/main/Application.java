package br.com.s2it.main;

/*
 * @author: Henderson Silva
 * @createDate: 22/11/2018
 * @description: Questão 9 da avaliação técnica
 * @company: S2it
 */

import java.util.LinkedList;
import java.util.Queue; 

public class Application { 
	
	static Node root; 
	static Node temp = root;
	
	public static void main(String args[]) 
	 { 
		  
	     root = new Node(10); 
	     root.left  = new Node(11); 
	     root.left.left = new Node(7);
	     root.right = new Node(9); 
	     root.right.left = new Node(15); 
	     root.right.right = new Node(8); 
	     
	     System.out.println("A soma de todos os nós subsequentes é: "+ calculate(root));
	 } 
    
	static int calculate(Node node)
	{
		return sum(node.left) + sum(node.right);
	}
 
	static int sum(Node node)
	{
		int result = 0;
	    if(node != null)
	    {

	    	Node left = node.left;
	    	Node right = node.right;

	    	if(left != null)
	    		result += sum(left) + sum(right);

	    	if(right != null)
	    		result +=  sum(right.left) + sum(right.right);

	    	return node.valor + result;
	    	
	    }
	    else
	    	return 0;

	}
   
	 static void insert(Node temp, int key) 
	 { 
	     Queue<Node> q = new LinkedList<Node>(); 
	     q.add(temp); 
	    
	     while (!q.isEmpty()) { 
	         temp = q.peek(); 
	         q.remove(); 
	    
	         if (temp.left == null) { 
	             temp.left = new Node(key); 
	             break; 
	         } else
	             q.add(temp.left); 
	    
	         if (temp.right == null) { 
	             temp.right = new Node(key); 
	             break; 
	         } else
	             q.add(temp.right); 
	     } 
	 } 
    

 
} 
