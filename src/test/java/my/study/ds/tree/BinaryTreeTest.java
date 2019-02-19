package my.study.ds.tree;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void replaceNodeValueWithSumOfInorderPreAndSucc() {
		BinaryTree tree = new BinaryTree(100);
		
		List inorderTraversal = new ArrayList();
		
		tree.printTree(tree.getRoot());
		tree.inOrder(tree.getRoot(),inorderTraversal);
		
		java.util.Stack<Node> stack = new java.util.Stack<Node>();
		
		stack.push(tree.getRoot());
		
		Node node = null;
		
		while(!stack.isEmpty()) {
			node = stack.pop();
			
			if(node.getLeft()!=null)
				stack.push(node.getLeft());
			if(node.getRight()!=null)
				stack.push(node.getRight());
			
			int index = inorderTraversal.indexOf(node.getData());
			node.setData(node.getData()+(index > 0 ? ((Integer)inorderTraversal.get(index-1)):0) + (index<inorderTraversal.size()-1 ? ((Integer)inorderTraversal.get(index+1)):0));
		}
		tree.printTree(tree.getRoot());
	}	

	public void exchangeALternateNodesOfBinaryTree() {
		
	}
}
