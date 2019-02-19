package my.study.ds.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class LevelOrderInsertionTest {

	@Test
	public void test() {
		BinaryTree tree = new BinaryTree(50);
		
		tree.levelOrderInsertion(5);
		tree.printTree(tree.getRoot());
	}
}