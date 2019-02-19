package my.study.ds.tree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TreeConstructionTest {

	@Test
	public void test() {
		BinaryTree tree = new BinaryTree(10);
		
		//tree.printTree(tree.getRoot());
		
		tree.preOrderNonRecursive();
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(40);
		list.add(50);*/
		
	
		
		//tree.setRoot(tree.constructTreeUsingPreorder(list));
		//tree.printTree(tree.getRoot());
	}
}