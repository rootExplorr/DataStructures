package my.study.ds.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import my.study.ds.list.Stack;

public class BinaryTree {
	private Node root;
	
	public Node getRoot() {
		return root;
	}
	
	public void setRoot(Node root) {
		this.root = root;
	}
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	public BinaryTree(int data) {
		root = new Node(data);
		generateBinaryTree();
	}
	
	private void generateBinaryTree() {
		// TODO Auto-generated method stub
		Node current = root;
		
		current.setLeft(new Node(30));
		current.setRight(new Node(70));
		
		current.getLeft().setLeft(new Node(15));
		current.getLeft().setRight(new Node(40));
		
		current.getRight().setLeft(new Node(60));
		current.getRight().setRight(new Node(80));
	}

	public void levelOrderInsertion(int data) {
		Node parent = root;
		Node lc,rc;
		Queue<Node> queue = new LinkedList();
		
		while(true) {
			lc = parent.getLeft();
			rc = parent.getRight();
			
			//Check if left is null
			if(lc == null) {
				parent.setLeft(new Node(data));
				break;
			}
			
			//Check if right is null
			if(rc == null) {
				parent.setRight(new Node(data));
				break;
			}
			
			//If both left and right pointers are not null, insert them into queue to move to the next level.
			
			queue.add(lc);
			queue.add(rc);
			
			parent = queue.remove();			
		}
	}
	
	public void printTree(Node node) {
		if(node == null)
			return;
		
		printTree(node.getLeft());
		
		System.out.println(node.getData());
		
		printTree(node.getRight());
	}
	
	public void BFS() {
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(getRoot());
		Node node = null;
		while(!queue.isEmpty()) {
			node = queue.peek();
			if(node.getLeft()!=null)
				queue.add(node.getLeft());
			if(node.getRight()!=null)
				queue.add(node.getRight());			
			
			System.out.println(node.getData()+",");
			queue.remove();
		}
	}
	
	public void inOrder(Node node,List inorderTraversal) {
		if(node==null)
			return;
		inOrder(node.getLeft(),inorderTraversal);
		inorderTraversal.add(node.getData());
		inOrder(node.getRight(),inorderTraversal);
	}
	
	public void preOrder(Node node) {
		if(node==null)
			return;
		System.out.println(node.getData());
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}
	
	public void postOrder(Node node) {
		if(node==null)
			return;
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.println(node.getData());		
	}
	
	public void preOrderNonRecursive() {
		Node node = root;
		java.util.Stack<Node> stack = new java.util.Stack<Node>();
		stack.push(node);
		/*
		do {
			if(!node.isVisited())
			{
				System.out.println(node.getData());
				node.setVisited(true);
			}			
			
			if(node.getLeft()!=null && !node.getLeft().isVisited())
				stack.push(node.getLeft());
			
			else if(node.getRight()!=null && !node.getRight().isVisited())
				stack.push(node.getRight());
			//IF both left and right nodes are null.
			else stack.pop();
			if(!stack.isEmpty())
			   node = stack.peek();
		}*/
		
		//ritika
		
		/*System.out.println(node.getData());
		while(!stack.isEmpty())
		{
			if(node==null) {
				node=stack.peek();
			}
			if(node.getLeft()!=null&&!node.getLeft().isVisited()) {
				node=node.getLeft();
				stack.push(node);
				System.out.println(node.getData());
			}else
			if(node.getRight()!=null&&!node.getRight().isVisited()) {
				node=node.getRight();
				stack.push(node);
				System.out.println(node.getData());
				
			}else {
				node.setVisited(true);
				stack.pop();
				node=null;
			}
		}*/
		
		
		//Salil
		while(!stack.isEmpty()) {
			node = stack.peek();
			if(!node.isVisited()) {
				System.out.println(node.getData());
			    node.setVisited(true);
			}
			
			if(node.getLeft()!=null && !node.getLeft().isVisited())
				stack.push(node.getLeft());
			
			else {
				if(node.getLeft().isVisited())
					stack.pop();
				else if (node.getLeft() == null || (node.getLeft().isVisited() && node.getRight().isVisited()))
					stack.push(node.getRight());
			}
		}
		
	}
	
	public void postOrderNonRecursive() {
		Node node = root;
		java.util.Stack<Node> stack = new java.util.Stack<Node>();
		stack.push(node);
		
		do {			
			if(node.getLeft()!=null && !node.getLeft().isVisited())
				stack.push(node.getLeft());
			
			else if(node.getRight()!=null && !node.getRight().isVisited())
				stack.push(node.getRight());
			//If both left and right nodes are null.
			if((node.getLeft()==null && node.getRight()==null) || (node.getLeft().isVisited() && node.getRight().isVisited()))
			{
				System.out.println(node.getData());
				node.setVisited(true);
				stack.pop();
			}			
			if(!stack.isEmpty())
			   node = stack.peek();
		}while(!stack.isEmpty());
	}
	
	public void inOrderNonRecursive() {
		Node node = root;
		java.util.Stack<Node> stack = new java.util.Stack<Node>();
		stack.push(node);
		
		do {			
			if(node.getLeft()!=null && !node.getLeft().isVisited())
				stack.push(node.getLeft());
			//If both left and right nodes are null.
			else if((node.getLeft()==null && node.getRight()==null) || (node.getLeft().isVisited()))
			{
				System.out.println(node.getData());
				node.setVisited(true);
				stack.pop();
				if(node.getRight()!=null && !node.getRight().isVisited())
					stack.push(node.getRight());							
			}			
			
			if(!stack.isEmpty())
			   node = stack.peek();
		}while(!stack.isEmpty());
	}
	
	public static Node constructTreeUsingPreorder(List<Integer> list) {
		if(list.size()==1)
			return new Node(list.get(0));
		else if(list.size()==0)
			return null;
			
		int i=0;
		Node root = new Node(list.get(0));
		
		while(list.get(++i)<list.get(0));
		
		root.setLeft(constructTreeUsingPreorder(list.subList(1,i)));
		
		root.setRight(constructTreeUsingPreorder(list.subList(i,list.size())));
		
		return root;
	}
}