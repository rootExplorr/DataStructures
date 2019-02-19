package my.study.ds.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTraversalTest {

	@Test
	public void test() {
		BinaryTree tree = new BinaryTree(50);
		
		System.out.println("Inorder Traversal");
		tree.inOrderNonRecursive();
		System.out.println("-----------------");
		System.out.println("Preorder Traversal");
		tree.preOrderNonRecursive();
		System.out.println("-----------------");
		System.out.println("Postorder Traversal");
		tree.postOrderNonRecursive();
		System.out.println("-------------------");
	}

}
