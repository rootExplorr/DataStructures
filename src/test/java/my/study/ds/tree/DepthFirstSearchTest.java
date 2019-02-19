package my.study.ds.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepthFirstSearchTest {

	@Test
	public void test() {
		BinaryTree tree = new BinaryTree(50);
		
		System.out.println("Inorder Traversal");
		tree.inOrder(tree.getRoot());
		System.out.println("-----------------");
		System.out.println("Preorder Traversal");
		tree.preOrder(tree.getRoot());
		System.out.println("-----------------");
		System.out.println("Postorder Traversal");
		tree.postOrder(tree.getRoot());
		System.out.println("-------------------");
	}
}
