package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.Stack;
import my.study.ds.list.StackEmptyException;
import my.study.ds.list.StackOverFLowException;

public class TheCelebrityProblem {

	public static void main(String[] args) throws StackOverFLowException, StackEmptyException {
		/*int peopleKnowPeople[][] = new int [][]{{0,1,1,1},{0,0,0,1},{0,0,0,1},{0,1,0,1}};
		
		int A=0,B=1;
		int common[] = new int[5]; 
		int index=0;
		
		for(int i=1;i<peopleKnowPeople.length;i++) {
			if(peopleKnowPeople[A][i]==1 && peopleKnowPeople[B][i]==1)
				common[index++]=i;
		}
		

		int i=0;
		boolean flag = false;
		for(;common[i]!=0;i++) {
			for (int j = 0; j < peopleKnowPeople.length; j++) {
				if(peopleKnowPeople[common[i]][j]==1)
					break;
			}
		}
		System.out.println(common[i-1]);*/
		
		int peopleKnowPeople[][] = new int [][]{{0,1,1,0},{0,0,1,0},{0,0,0,0},{0,1,0,0}};
		Stack stack = new Stack(peopleKnowPeople.length);
		
		for (int i = 0; i < peopleKnowPeople.length; i++) {
			stack.push(i);			
		}
		
		int A = stack.pop(),B;
		
		while(!stack.isEmpty()) {
			B = stack.pop();
			if(peopleKnowPeople[A][B]==1) {
				A = B;
			}
		}
		System.out.println(A);
	}
}