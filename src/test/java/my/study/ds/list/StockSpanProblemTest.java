package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

import my.study.ds.list.stack.geekforgeek.solutions.StockSpanProblem;

public class StockSpanProblemTest {

	@Test
	public void test() throws StackOverFLowException, StackEmptyException {
		StockSpanProblem problem = new StockSpanProblem(10);
		problem.scanStock(100);
		problem.scanStock(80);
		problem.scanStock(60);
		problem.scanStock(70);
		problem.scanStock(60);
		problem.scanStock(75);
		problem.scanStock(85);
	}

}
