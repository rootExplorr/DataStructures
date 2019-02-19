package my.study.ds.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BreadthFirstSearchTest {

	@Test
	public void test() {
		BinaryTree tree = new BinaryTree(50);		
		tree.BFS();
	}

}
