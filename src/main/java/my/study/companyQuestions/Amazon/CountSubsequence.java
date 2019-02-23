package my.study.companyQuestions.Amazon;

public class CountSubsequence {
	static String str;
	static int count=0;
	static StringBuffer str1 = new StringBuffer();
	public static void fc (int index) {
		if(str.charAt(index)=='a') {
			str1.append(index);
			int x=index; 
			while((x = str.indexOf("a",++x))>0){
				fc(x);
			}
			x=index;
			while((x = str.indexOf("b",++x))>0){
				fc(x);
			}
		}
		
		else if(str.charAt(index)=='b') {
			str1.append(index);
			int x ;
			x=index;
			while((x = str.indexOf('b', ++x))>0) {
				fc(x);
			}
			x=index;
			while((x = str.indexOf('c', ++x))>0) {
				fc(x); 
		   }
		}
		
		else if(str.charAt(index)=='c'){
			System.out.println(str1.toString()+index+",");
			count++;
			int x;
			x=index;
			while((x = str.indexOf("c",++x))>0){
				fc(x);
			}
		}
	}
	
	public static void main(String[] args) {
		str = "abcabc";
		int x=-1;
		while((x=str.indexOf("a",++x))>=0) {
			fc(x);
		}
		//fc(0);
		System.out.println(count);
	}

}
